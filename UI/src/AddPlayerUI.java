import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddPlayerUI extends JFrame {
    private JButton button = new JButton("Create Player");
    private JTextField input = new JTextField("");
    private JLabel label = new JLabel("Name Player:");
    private JLabel textForSport = new JLabel("Choice of sport:");
    private JRadioButton radioButtonFootball = new JRadioButton("Football");
    private JRadioButton radioButtonBasketball = new JRadioButton("Basketball");
    public JPanel radioSportType = new JPanel(new FlowLayout());
    JRadioButton radioButtonHokey = new JRadioButton("Hokey");
    JComboBox<String> teams;
    DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
    public  void closeW(){
        this.setVisible(false);
    }
    public AddPlayerUI(TournamentSystem tournamentSystem){
        super("Check teams");
        this.setBounds(100, 100, 960, 540);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 3));

        container.add(label);
        container.add(input);
        JButton back = new JButton("Back");



        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closeW();
                Menu.MainMenu(tournamentSystem);


            }
        });
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButtonFootball);
        buttonGroup.add(radioButtonHokey);
        buttonGroup.add(radioButtonBasketball);
        radioSportType.add(textForSport);
        radioSportType.add(radioButtonFootball);
        radioSportType.add(radioButtonHokey);
        radioSportType.add(radioButtonBasketball);

        for (int i = 0; i < tournamentSystem.getTeams().size();i++){
            model.addElement(tournamentSystem.getTeams().get(i).getTeamName());
        }
        teams = new JComboBox<>(model);
        JPanel itt = new JPanel(new FlowLayout());
        itt.add(teams);
        container.add(itt);

        button.addActionListener(new CreatePlayer(tournamentSystem));
        container.add(button);
        container.add(back);

    }

    class CreatePlayer implements ActionListener {
        TournamentSystem tournamentSystem;
        public CreatePlayer(TournamentSystem tournamentSystem){
            this.tournamentSystem = tournamentSystem;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            Team team = tournamentSystem.getTeamMap().get(teams.getSelectedItem());
            SportType sportType;
            if(radioButtonBasketball.isSelected()){
                sportType = new Backetball();
            } else if (radioButtonFootball.isSelected()) {
                sportType = new Football();
            }
            else {
                sportType = new Hockey();
            }
            team.addPlayerByName(new Player(input.getText(), sportType, 20, team));
        }
    }
}
