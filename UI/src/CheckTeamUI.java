import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class CheckTeamUI extends JFrame {

    JPanel players = new JPanel(new GridLayout(11,1));
    JPanel matches = new JPanel(new FlowLayout());
    JComboBox<String> teams;
    DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
    JButton buttonShowPlayers = new JButton("Show");
    public  void closeW(){
        this.setVisible(false);
    }
    public CheckTeamUI(TournamentSystem tournamentSystem){
        super("Check teams");
        this.setBounds(100, 100, 1260, 540);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(1, 3));
        for (int i = 0; i < tournamentSystem.getTeams().size();i++){
            model.addElement(tournamentSystem.getTeams().get(i).getTeamName());
        }
        teams = new JComboBox<>(model);
        JPanel itt = new JPanel(new FlowLayout());
        buttonShowPlayers.addActionListener(new ShowPlayers(tournamentSystem, container));
        itt.add(teams);
        itt.add(buttonShowPlayers);
        container.add(itt);

        container.add(players);
        JButton back = new JButton("Back");



        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closeW();
                Menu.MainMenu(tournamentSystem);

            }
        });
        container.add(back);
    }

    class ShowPlayers implements ActionListener {
        TournamentSystem tournamentSystem;
        Container container;
        public ShowPlayers(TournamentSystem tournamentSystem, Container container){
            this.tournamentSystem = tournamentSystem;
            this.container = container;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Team team = tournamentSystem.getTeamMap().get(teams.getSelectedItem());
            container.remove(1);
            players.removeAll();
            players = new JPanel(new FlowLayout());
            for (int i = 0; i < team.getPlayers().size(); i++){
                Player pl = team.getPlayers().get(i);
                JPanel player = new JPanel(new FlowLayout());
                JLabel name = new JLabel("Name: " + pl.getPlayerName());
                JLabel sport = new JLabel("Sport: " + pl.getSport().getNameSport());
                JLabel skill = new JLabel("Skill: " + Integer.toString(pl.getSkill()));
                JLabel teamP = new JLabel("Team: " + pl.getTeam());
                player.add(name);
                player.add(sport);
                player.add(skill);
                player.add(teamP);
                players.add(player);
            }

            players.updateUI();
            matches.removeAll();
            matches.add(new JLabel("MATCHES"));
            for (int i = 0; i < team.getMatches().size(); i++){
                Match mt = team.getMatches().get(i);
                JPanel mtUI = new JPanel(new FlowLayout());
                JLabel name = new JLabel("Team first: " + mt.getTeamFirst().getTeamName());
                JLabel sport = new JLabel("Team second: " + mt.getTeamSecond().getTeamName());
                JLabel skill = new JLabel("Winner: " + mt.getWinner().getTeamName());

                mtUI.add(name);
                mtUI.add(sport);
                mtUI.add(skill);
                matches.add(mtUI);
            }
            matches.updateUI();

            container.add(players);
            container.add(matches);

        }
    }

}
