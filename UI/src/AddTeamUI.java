import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddTeamUI extends JFrame {
    private JButton button = new JButton("Create Team");
    private JTextField input = new JTextField("");
    private JLabel label = new JLabel("Name Team:");
    private JTextField inputDis = new JTextField("");
    private JLabel labelDis = new JLabel("Input Description:");
    private JLabel textForSport = new JLabel("Choice of sport:");
    private JRadioButton radioButtonFootball = new JRadioButton("Football");
    private JRadioButton radioButtonBasketball = new JRadioButton("Basketball");
    JRadioButton radioButtonHokey = new JRadioButton("Hokey");
    public JPanel radioSportType = new JPanel(new FlowLayout());


    public  void closeW(){
        this.setVisible(false);
    }

    public AddTeamUI(TournamentSystem tournamentSystem){
        super("Add team");
        this.setBounds(100, 100, 960, 540);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(4, 3));

        container.add(label);
        container.add(input);
        container.add(labelDis);
        container.add(inputDis);
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
        radioButtonHokey.setSelected(true);
        radioSportType.add(textForSport);
        radioSportType.add(radioButtonFootball);
        radioSportType.add(radioButtonHokey);
        radioSportType.add(radioButtonBasketball);

        container.add(radioSportType);
        button.addActionListener(new CreateTeam(tournamentSystem));
        container.add(button);

        container.add(back);

    }

    class CreateTeam implements ActionListener {
        TournamentSystem tournamentSystem;
        public CreateTeam(TournamentSystem tournamentSystem){
            this.tournamentSystem = tournamentSystem;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            Team team = new Team(input.getText(), null, inputDis.getText());
            SportType sportType;
            if(radioButtonBasketball.isSelected()){
                sportType = new Backetball();
            } else if (radioButtonFootball.isSelected()) {
                sportType = new Football();
            }
            else {
                sportType = new Hockey();
            }
            team.setSportType(sportType);
            tournamentSystem.addTeam(team);
        }
    }
}
