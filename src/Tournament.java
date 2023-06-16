

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class Tournament {
    private Boolean isFinished;
    private ArrayList<Team> Participants;
    public Vector<String> teamsName = new Vector<>();
    private TournamentGrid grid;
    private SportType sportType;
    private Tournament tournament;

    public void displayTournament() throws IOException {
        getJFrame();
        jFrame.setVisible(true);

    }

    JFrame jFrame = new JFrame("Tournament");

    private JFrame getJFrame() throws IOException {

        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(1500, 700);

        jFrame.setLayout(new BorderLayout());
        JPanel jPanel = new JPanel(new GridLayout(Participants.size(), 1));

        for (int i = 0; i < Participants.size(); i++) {
            BufferedImage image = ImageIO.read(new File("img\\teamSpirit.jpg"));
            Image logo = image.getScaledInstance(100, 100, Image.SCALE_DEFAULT);
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

        jFrame.add(jPanel, BorderLayout.WEST);

        jFrame.add(grid.generateGridUI(this), BorderLayout.CENTER);

        JButton startTournament = new JButton("Start");
        startTournament.addActionListener(new GridUI(this));

        jFrame.add(startTournament, BorderLayout.EAST);
        return jFrame;
    }

    private String name;

    private ArrayList<Match> Matchs;      //НОВОЕ СВОЙСТВО - ВСЕ ИГРЫ ЗА ТУРНИР


    public Tournament(String name, SportType sportType, TournamentGrid grid) {
        this.name = name;
        this.sportType = sportType;
        this.isFinished = false;
        this.Participants = new ArrayList<Team>();
        this.Matchs = new ArrayList<Match>();
        this.grid = grid;
        tournament = this;
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
        if (teamsName.isEmpty()) {
            teamsName.add("  ");
            teamsName.add(team.getTeamName());

        } else {
            teamsName.add(team.getTeamName());
        }

    }

    public void removeTeam(Team team) {
        if (Participants.contains(team)) {
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


    public void startTour() throws IOException {
        grid.generateGrid(this);
        grid.setResultInGrid();
        jFrame.add(new Label("Победитель: Тут будет победитель"), BorderLayout.NORTH);
        displayTournament();
    }
}
