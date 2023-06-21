import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Vector;

public class TournamentUI extends JFrame {
    JFrame jFrame = new JFrame();
    JTable grid;
    JTree olympicGrid;

    public  void closeW(){
        this.setVisible(false);
    }
    public TournamentUI(Tournament tournament, TournamentSystem tournamentSystem) throws NoSuchFieldException {
        jFrame.setTitle(tournament.getName());

        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(1500, 800);

        jFrame.setLayout(new BorderLayout());
        JPanel jPanel = new JPanel(new GridLayout(tournament.getParticipants().size(), 1));

        tournament.getParticipants().forEach((Team team) -> {

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

        JButton back = new JButton("Back");



        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.setVisible(false);
                closeW();
                Menu.MainMenu(tournamentSystem);

            }
        });
        jFrame.add(back, BorderLayout.SOUTH);
        jFrame.add(jPanel, BorderLayout.WEST);

        if (tournament.getGrid() instanceof RoundRobinGrid) {
            grid = generateRoundRobinTable(tournament);
            jFrame.add(grid, BorderLayout.CENTER);
        } else if (tournament.getGrid() instanceof SingleElimination) {
            grid = generateSingleTable(tournament);
            jFrame.add(grid, BorderLayout.CENTER);
        } else {
            /*olympicGrid =

            jFrame.add(olympicGrid);*/
            /*generateOlympicGrid(tournament);*/
        }


        JButton startTournament = new JButton("Start");
        startTournament.addActionListener(new GridUI(tournament));

        jFrame.add(startTournament, BorderLayout.EAST);

    }

    private JTree generateOlympicGrid(Tournament tournament) {
        int grsize = (int) (Math.log(tournament.getParticipants().size()) / Math.log(2));
        for (int i = 0; i < grsize + 1; i++) {
            System.out.println("Раунд " + (grsize + 1 - i));
            List<Team> round = tournament.getGrid().resultMatchs.get(grsize - i);
            for (Team result : round) {
                System.out.println(result.getTeamName());
            }
            System.out.println();
        }
        return null;
    }

    private JTable generateSingleTable(Tournament tournament) {
        Vector<Vector<String>> a = new Vector<Vector<String>>();

        for (int i = 0; i < 2; i++) {
            Vector vasyan_info = new Vector();

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

        public GridUI(Tournament tournament) {
            this.tournament = tournament;

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (tournament.getFinished()) {
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


            if (tournament.getGrid() instanceof RoundRobinGrid) {
                for (int i = 0; i < tournament.getGrid().matches.size(); i++) {
                    for (int j = 0; j < tournament.getGrid().matches.size(); j++) {
                        grid.setValueAt(tournament.getGrid().resultMatchs.get(i).get(j).getTeamName(), i + 1, j + 1);
                    }
                }
            } else if (tournament.getGrid() instanceof SingleElimination) {
                for (int j = 0; j < tournament.getGrid().resultMatchs.get(0).size(); j++) {
                    grid.setValueAt(tournament.getGrid().resultMatchs.get(0).get(j).getTeamName(), 1, j + 2);

                }
                System.out.println(tournament.getGrid().resultMatchs.get(0));
            }
            else {
                generateOlympicGrid(tournament);


                TreeNode f = OlympicTreeBuilder.buildTree(tournament.getGrid().matches.get(0));
                System.out.println(OlympicTreeBuilder.printTree(f));
                OlympicTreeBuilder.printTree(OlympicTreeBuilder.buildTree(tournament.getGrid().matches.get(0)));
                System.out.println(657);
                olympicGrid = new JTree(OlympicTreeBuilder.printTree(f));
                jFrame.add(olympicGrid, BorderLayout.CENTER);
                System.out.println(tournament.getGrid().resultMatchs);

            }


            jFrame.setVisible(true);
            jFrame.add(new Label("Победитель: " + tournament.getGrid().getWinner()), BorderLayout.NORTH);

        }
    }

}
