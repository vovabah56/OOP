import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class Tournament {
    private Boolean isFinished;
    private ArrayList<Team> Participants;
    private Vector<String> teamsName = new Vector<>();

    private SportType sportType;
    public void displayTournament() throws IOException {
        JFrame jFrame = getJFrame();
    }

    private JFrame getJFrame() throws IOException {
        JFrame jFrame = new JFrame("Tournament");
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(1500, 900);



        jFrame.setLayout(new BorderLayout());
        JPanel jPanel = new JPanel(new GridLayout(Participants.size(), 1));
        Vector<Vector<String>> a = new Vector<Vector<String>>();


        for (int i = 0; i < teamsName.size(); i++){
            Vector vasyan_info = new Vector();

            vasyan_info.add(teamsName.get(i));

            for (int j = 0; j < Participants.size()+1; j++){
                if(i == 0 && j < Participants.size()){

                    vasyan_info.add(Participants.get(j).getTeamName());
                }
                else{
                    if(i == j+1){
                        vasyan_info.add("---");
                    }
                    else{
                        vasyan_info.add("0");
                    }
                }
            }
            a.add(vasyan_info);
        }

        JTable grid = new JTable(a, teamsName);

        for (int i = 0; i < Participants.size(); i++){

            BufferedImage image;
            image = ImageIO.read(new File("img\\teamSpirit.jpg"));
            Image logo =  image.getScaledInstance(100, 100, Image.SCALE_DEFAULT);
            JLabel picLabel = new JLabel(new ImageIcon(logo));
            JLabel descriptionLabel1 = new JLabel(Participants.get(i).getDescription());
            JPanel f = new JPanel();
            f.add(picLabel, BorderLayout.WEST);
            JPanel descriptionAndName = new JPanel(new GridLayout(2, 1));
            descriptionAndName.add(new Label(Participants.get(i).getTeamName()));

            descriptionAndName.add(descriptionLabel1);
            f.add(descriptionAndName, BorderLayout.WEST);
            jPanel.add(f, BorderLayout.WEST);
        }

        jFrame.add(jPanel,  BorderLayout.WEST);

        jFrame.add(grid, BorderLayout.CENTER);

        JButton startTournament = new JButton("Start");
        startTournament.setMaximumSize(new Dimension(100, 100));
        startTournament.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // тут будет код который будет выполнятся при нажатии на кнопку
            }
        });
        jFrame.add(startTournament, BorderLayout.EAST);
        return jFrame;
    }

    private String name;

    private ArrayList<Match> Matchs;      //НОВОЕ СВОЙСТВО - ВСЕ ИГРЫ ЗА ТУРНИР

    private TournamentGrid grid;

    public Tournament(String name, SportType sportType, TournamentGrid grid) {
        this.name = name;
        this.sportType = sportType;
        this.isFinished = false;
        this.Participants = new ArrayList<Team>();
        this.Matchs = new ArrayList<Match>();
        this.grid = grid;
    }

    public Boolean getFinished() {
        return isFinished;
    }

    public ArrayList<Team> getParticirants() {
        return Participants;
    }

    public ArrayList<Match> getMatchs() {
        return Matchs;
    }

    public String getName() {
        return name;
    }

    public void addTeam(Team team) {
        if (Participants.contains(team)) return;
        Participants.add(team);
        if(teamsName.isEmpty()){
            teamsName.add("  ");
            teamsName.add(team.getTeamName());
            System.out.println(1234);
        }
        else {
            teamsName.add(team.getTeamName());
        }

    }

    public void removeTeam(Team team) {
        if(Participants.contains(team)) {
            Participants.remove(team);
        }
    }

    public void setSport(SportType sportType) {
        this.sportType = sportType;
    }

    public void addMatch(Match match) {
        if (Matchs.contains(match)) return;
        Matchs.add(match);
    }


    // Временно, пока нет сеток
    public Team getWinner() {
        ArrayList<Integer> cntWin = new ArrayList<>(Participants.size());

        for (int i = 0; i < Participants.size(); i++) {
            cntWin.add(0);
        }

        // проходим по всем матчам и увеличиваем значение в индексе победителя
        for (int i = 0; i < Matchs.size(); i++) {
            int t = cntWin.get(Participants.indexOf(Matchs.get(i).defineWins()));
            cntWin.set(Participants.indexOf(Matchs.get(i).defineWins()), t + 1);
        }

        // возвращаем команду с наибольшим количеством побед
        return Participants.get(cntWin.indexOf(Collections.max(cntWin)));
    }

    public void startTour(){
        grid.generateGrid(this);

    }
}
