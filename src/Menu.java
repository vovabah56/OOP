import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class Menu {
    public static JFrame createDisplayOfAdditionalMenu() {
        JFrame display = new JFrame("Tournament App");
        display.setSize(960, 540);
        display.setLocationRelativeTo(null);
        GridLayout g = new GridLayout(3, 3);
        display.setLayout(g);
        JButton back = new JButton("Back");
        display.add(back);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.dispatchEvent(new WindowEvent(display, WindowEvent.WINDOW_CLOSING));
                MainMenu();

            }
        });

        return display;
    }

    public static void MainMenu() {
        JFrame display = new JFrame("Tournament App");
        display.setSize(960, 540);
        display.setLocationRelativeTo(null);

        GridLayout g = new GridLayout(0, 1, 0, 50);
        display.setLayout(g);
        JButton playersAdd = new JButton("Add Player");
        playersAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.dispatchEvent(new WindowEvent(display, WindowEvent.WINDOW_CLOSING));
                PlayerAddMenu();

            }
        });

        JButton teamAdd = new JButton("Add Team");
        teamAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.dispatchEvent(new WindowEvent(display, WindowEvent.WINDOW_CLOSING));
                teamAddMenu();

            }
        });

        JButton playerAddInTeam = new JButton("Add Player in Team");
        playerAddInTeam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.dispatchEvent(new WindowEvent(display, WindowEvent.WINDOW_CLOSING));
                playerAddInTeamMenu();

            }
        });

        JButton createTournament = new JButton("Create Tournament");
        createTournament.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.dispatchEvent(new WindowEvent(display, WindowEvent.WINDOW_CLOSING));
                createTournamentMenu();

            }
        });

        display.add(playersAdd);
        display.add(teamAdd);
        display.add(playerAddInTeam);
        display.add(createTournament);
        display.setVisible(true);
    }

    public static void PlayerAddMenu() {
        JFrame display = createDisplayOfAdditionalMenu();

        JPanel content = new JPanel();
        JTextField namePlayerJ = new JTextField("Name",40);
        JTextField sportPlayerJ = new JTextField("Sport",40);
        JTextField skillPlayerJ = new JTextField("Skill",40);
        JTextField teamPlayerJ = new JTextField("Team", 40);

        namePlayerJ.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = namePlayerJ.getText();
            }
        });

        sportPlayerJ.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = sportPlayerJ.getText();
            }
        });


        content.add(namePlayerJ);
        display.add(content);

        display.setVisible(true);
    }
    public static void teamAddMenu() {
        JFrame display = createDisplayOfAdditionalMenu();


        display.setVisible(true);
    }

    public static void playerAddInTeamMenu() {
        JFrame display = createDisplayOfAdditionalMenu();

        display.setVisible(true);
    }

    public static void createTournamentMenu() {
        JFrame display = createDisplayOfAdditionalMenu();

        display.setVisible(true);
    }
}
