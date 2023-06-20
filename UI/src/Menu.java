import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class Menu {
    public static JFrame createDisplayOfAdditionalMenu(TournamentSystem tournamentSystem) {
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
                MainMenu(tournamentSystem);

            }
        });

        return display;
    }

    public static void MainMenu(TournamentSystem tournamentSystem) {
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
                PlayerAddMenu(tournamentSystem);

            }
        });

        JButton teamAdd = new JButton("Add Team");
        teamAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.dispatchEvent(new WindowEvent(display, WindowEvent.WINDOW_CLOSING));
                teamAddMenu(tournamentSystem);

            }
        });

        JButton removePlayer = new JButton("Remove player");
        removePlayer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.dispatchEvent(new WindowEvent(display, WindowEvent.WINDOW_CLOSING));
                removePlayer(tournamentSystem);

            }
        });

        JButton checkTeam = new JButton("Check team");
        checkTeam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.dispatchEvent(new WindowEvent(display, WindowEvent.WINDOW_CLOSING));
                checkTeamTeamMenu(tournamentSystem);

            }
        });

        JButton createTournament = new JButton("Create Tournament");
        createTournament.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.dispatchEvent(new WindowEvent(display, WindowEvent.WINDOW_CLOSING));
                createTournamentMenu(tournamentSystem);

            }
        });

        display.add(playersAdd);
        display.add(teamAdd);
        display.add(removePlayer);
        display.add(checkTeam);
        display.add(createTournament);
        display.setVisible(true);
    }

    private static void checkTeamTeamMenu(TournamentSystem tournamentSystem) {
        JFrame display = new CheckTeamUI(tournamentSystem);


        display.setVisible(true);
    }

    public static void PlayerAddMenu(TournamentSystem tournamentSystem) {
        JFrame display = new AddPlayerUI(tournamentSystem);


        display.setVisible(true);
    }
    public static void teamAddMenu(TournamentSystem tournamentSystem) {
        JFrame display = new AddTeamUI(tournamentSystem);


        display.setVisible(true);
    }

    public static void removePlayer(TournamentSystem tournamentSystem) {
        JFrame display = new RemovePlayerUI(tournamentSystem);

        display.setVisible(true);
    }

    public static void createTournamentMenu(TournamentSystem tournamentSystem) {
        JFrame display = new CreateTournamentUI(tournamentSystem);

        display.setVisible(true);
    }
}
