import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Vector;

public class TournamentUI extends JFrame {
    JFrame jFrame = new JFrame();
    JTable grid;
    public TournamentUI(Tournament tournament) throws NoSuchFieldException {
            jFrame.setTitle(tournament.getName());

            jFrame.setVisible(true);
            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame.setSize(1500, 900);

            jFrame.setLayout(new BorderLayout());
            JPanel jPanel = new JPanel(new GridLayout(tournament.getParticipants().size(), 1));

            tournament.getParticipants().forEach((Team team) ->{

                BufferedImage image = null;
                try {
                    image = ImageIO.read(new File(team.getLogo()));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

                Image logo = image.getScaledInstance(100, 100, Image.SCALE_DEFAULT);
                JLabel picLabel = new JLabel(new ImageIcon(logo));
                JLabel descriptionLabel1 = new JLabel(team.getDescription());
                JPanel f = new JPanel();
                f.add(picLabel, BorderLayout.WEST);
                JPanel descriptionAndName = new JPanel(new GridLayout(2, 1));
                descriptionAndName.add(new Label(team.getTeamName()));

                descriptionAndName.add(descriptionLabel1);
                f.add(descriptionAndName, BorderLayout.WEST);
                jPanel.add(f, BorderLayout.WEST);

            });


            jFrame.add(jPanel, BorderLayout.WEST);

            if(tournament.getGrid() instanceof RoundRobinGrid){
                grid = generateRoundRobinTable(tournament);
            }
            else if (tournament.getGrid() instanceof SingleElimination){
                grid = generateSingleTable(tournament);
            }
            else{
                grid = new JTable();
            }


            jFrame.add(grid, BorderLayout.CENTER);

            JButton startTournament = new JButton("Start");
            startTournament.addActionListener(new GridUI(tournament));

            jFrame.add(startTournament, BorderLayout.EAST);

    }

    private JTable generateSingleTable(Tournament tournament) {
        Vector<Vector<String>> a = new Vector<Vector<String>>();

        for (int i = 0; i < 2; i++){
            Vector vasyan_info = new Vector();

            vasyan_info.add(tournament.teamsName.get(i));

            for (int j = 0; j < tournament.getParticipants().size()+1; j++){
                if(i == 0 && j < tournament.getParticipants().size()){
                    vasyan_info.add(tournament.getParticipants().get(j).getTeamName());
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



        return new JTable(a, tournament.teamsName);
    }

    private JTable generateRoundRobinTable(Tournament tournament) {
        Vector<Vector<String>> a = new Vector<>();


        for (int i = 0; i < tournament.teamsName.size(); i++) {
            Vector<String> vasyan_info = new Vector<>();

            vasyan_info.add(tournament.teamsName.get(i));

            for (int j = 0; j < tournament.getParticipants().size() + 1; j++) {
                if (i == 0 && j < tournament.getParticipants().size()) {

                    vasyan_info.add(tournament.getParticipants().get(j).getTeamName());
                } else {
                    if (i == j + 1) {
                        vasyan_info.add("---");
                    } else {
                        vasyan_info.add("0");
                    }
                }
            }
            a.add(vasyan_info);
        }



        return new JTable(a, tournament.teamsName);
    }



    class GridUI implements ActionListener {
        Tournament tournament;

        public GridUI(Tournament tournament){
            this.tournament = tournament;

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(tournament.getFinished()) {
                JOptionPane.showMessageDialog(new JOptionPane(),
                        "Турнир уже завершен.",
                        "Ошибка", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            try {
                tournament.startTour();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            for (int i = 0; i < tournament.getGrid().matches.size(); i++) {
                for (int j = 0; j < tournament.getGrid().matches.size(); j++) {
                    grid.setValueAt(tournament.getGrid().resultMatchs.get(i).get(j), i + 1, j + 1);
                }

            }
            if(tournament.getGrid() instanceof RoundRobinGrid){

            } else if (tournament.getGrid() instanceof SingleElimination) {
                for (int j = 0; j < tournament.getGrid().resultMatchs.get(0).size(); j++){
                    grid.setValueAt(tournament.getGrid().resultMatchs.get(0).get(j), 1, j+2);
                }
            }

            jFrame.setVisible(true);
            jFrame.add(new Label("Победитель: " + tournament.getGrid().getWinner()), BorderLayout.NORTH);

        }
    }

}
