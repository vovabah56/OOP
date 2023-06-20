import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RemovePlayerUI extends JFrame {
    private JButton button = new JButton("Remove Player");


    JComboBox<String> teams;
    JComboBox<String> players;

    DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
    DefaultComboBoxModel<String> modelPlayers = new DefaultComboBoxModel<>();

    public  void closeW(){
        this.setVisible(false);
    }

    public RemovePlayerUI(TournamentSystem tournamentSystem){
        super("Check teams");
        this.setBounds(100, 100, 960, 540);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(4, 3));

        JButton back = new JButton("Back");

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closeW();
                Menu.MainMenu(tournamentSystem);

            }
        });


        for (int i = 0; i < tournamentSystem.getTeams().size();i++){
            model.addElement(tournamentSystem.getTeams().get(i).getTeamName());
        }
        teams = new JComboBox<>(model);
        teams.addActionListener(new CheckPlayer(tournamentSystem));
        JPanel itt = new JPanel(new FlowLayout());
        itt.add(teams);
        container.add(itt);
        players = new JComboBox<>(modelPlayers);
        itt.add(players);


        button.addActionListener(new RemovePlayer(tournamentSystem));
        container.add(button);

        container.add(back);

    }

    class RemovePlayer implements ActionListener {
        TournamentSystem tournamentSystem;
        public RemovePlayer(TournamentSystem tournamentSystem){
            this.tournamentSystem = tournamentSystem;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            Team team = tournamentSystem.getTeamMap().get(teams.getSelectedItem());
            for (int i = 0; i < team.getPlayers().size(); i++){
                if(team.getPlayers().get(i).getPlayerName() == players.getSelectedItem()){
                    team.deletePlayerByName(team.getPlayers().get(i));
                }
            }


        }
    }
    class CheckPlayer implements ActionListener{
        TournamentSystem tournamentSystem;
        public CheckPlayer(TournamentSystem tournamentSystem){
            this.tournamentSystem = tournamentSystem;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            Team team = tournamentSystem.getTeamMap().get(teams.getSelectedItem());
            modelPlayers.removeAllElements();
            team.getPlayers().forEach((Player player) ->{
                modelPlayers.addElement(player.getPlayerName());
            });


        }
    }
}
