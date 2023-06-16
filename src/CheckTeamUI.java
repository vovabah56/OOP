import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckTeamUI extends JFrame {
    JComboBox<String> teams;


    JPanel players = new JPanel(new GridLayout(11,1));
    DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
    JButton buttonShowPlayers = new JButton("Show");
    public CheckTeamUI(TournamentSystem tournamentSystem){
        super("Check teams");
        this.setBounds(100, 100, 960, 540);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(1, 3));
        for (int i = 0; i < tournamentSystem.getTeams().size();i++){
            model.addElement(tournamentSystem.getTeams().get(i).getTeamName());
        }
        teams = new JComboBox<>(model);
        JPanel itt = new JPanel(new FlowLayout());
        buttonShowPlayers.addActionListener(new ShowPlayers(tournamentSystem));
        itt.add(teams);
        itt.add(buttonShowPlayers);
        container.add(itt);
        container.add(players);

    }

    class ShowPlayers implements ActionListener {
        TournamentSystem tournamentSystem;
        public ShowPlayers(TournamentSystem tournamentSystem){
            this.tournamentSystem = tournamentSystem;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            Team team = tournamentSystem.getTeamMap().get(teams.getSelectedItem());
            players = new JPanel();
            for (int i = 0; i < team.getPlayers().size(); i++){
                Player pl = team.getPlayers().get(i);
                JPanel player = new JPanel(new FlowLayout());
                JLabel name = new JLabel("Name: " + pl.getPlayerName());
                JLabel sport = new JLabel("Sport: " + pl.getSport().nameSport);
                JLabel skill = new JLabel("Skill: " + Integer.toString(pl.getSkill()));
                JLabel teamP = new JLabel("Team: " + pl.getTeam());
                player.add(name);
                player.add(sport);
                player.add(skill);
                player.add(teamP);
                players.add(player);
                players.updateUI();
            }
        }
    }

}
