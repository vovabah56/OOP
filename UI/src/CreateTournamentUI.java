import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.IOException;

public class CreateTournamentUI extends JFrame {
    private JButton button = new JButton("Create Tournament");
    private JTextField input = new JTextField("");
    private JLabel label = new JLabel("Name Tournament:");
    private JLabel textForSport = new JLabel("Choice of sport:");
    private JRadioButton radioButtonFootball = new JRadioButton("Football");
    private JRadioButton radioButtonBasketball = new JRadioButton("Basketball");
    private JLabel textForGrid = new JLabel("Choice of grid:");
    private JRadioButton radioButtonRoundRobin = new JRadioButton("Round Robin");
    private JRadioButton radioButtonSingle = new JRadioButton("Single Elimination");
    private JRadioButton radioButtonOlympic = new JRadioButton("Olympic");
    private JCheckBox checkBox = new JCheckBox("Check", false);
    JRadioButton radioButtonHokey = new JRadioButton("Hokey");

    public JPanel teams = new JPanel(new FlowLayout());

    private JPanel radioGrid = new JPanel(new FlowLayout());
    public JPanel radioSportType = new JPanel(new FlowLayout());

    public static void errorSport() {
        JOptionPane.showMessageDialog(new JOptionPane(),
                "Проверьте состав команд.",
                "Ошибка", JOptionPane.INFORMATION_MESSAGE);
    }

    public void closeW() {
        this.setVisible(false);
    }

    public CreateTournamentUI(TournamentSystem tournamentSystem) {
        super("Create Tournament");
        this.setBounds(100, 100, 960, 840);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(4, 3));

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
        radioButtonHokey.addActionListener(new ChoiceTeams(tournamentSystem, container));
        radioButtonBasketball.addActionListener(new ChoiceTeams(tournamentSystem, container));
        radioButtonFootball.addActionListener(new ChoiceTeams(tournamentSystem, container));

        ButtonGroup gridGroup = new ButtonGroup();
        gridGroup.add(radioButtonSingle);
        gridGroup.add(radioButtonRoundRobin);
        gridGroup.add(radioButtonOlympic);
        radioButtonHokey.setSelected(true);
        radioGrid.add(textForGrid);
        radioGrid.add(radioButtonSingle);
        radioGrid.add(radioButtonRoundRobin);
        radioGrid.add(radioButtonOlympic);

        radioButtonSingle.setSelected(true);
        container.add(radioSportType);
        container.add(radioGrid);


        container.add(teams);
        radioButtonFootball.setSelected(true);
        button.addActionListener(new TournamentCreate(tournamentSystem, this));
        container.add(button);
        container.add(back);
    }


    class TournamentCreate implements ActionListener {
        TournamentSystem tournamentSystem;
        CreateTournamentUI createTournamentUI;

        public TournamentCreate(TournamentSystem tournamentSystem, CreateTournamentUI createTournamentUI) {
            this.tournamentSystem = tournamentSystem;
            this.createTournamentUI = createTournamentUI;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Tournament newTournament;
            SportType sportType;
            if (createTournamentUI.radioButtonBasketball.isSelected()) {
                sportType = new Backetball();
            } else if (createTournamentUI.radioButtonFootball.isSelected()) {
                sportType = new Football();
            } else {
                sportType = new Hockey();
            }
            TournamentGrid grid;
            if (createTournamentUI.radioButtonSingle.isSelected()) {
                grid = new SingleElimination();
            } else if (createTournamentUI.radioButtonRoundRobin.isSelected()) {
                grid = new RoundRobinGrid();
            } else {
                grid = new OlympicGrid();
            }
            newTournament = new Tournament(createTournamentUI.input.getText(), sportType, grid);
            for (int i = 0; i < createTournamentUI.teams.getAccessibleContext().getAccessibleChildrenCount(); i++) {
                JCheckBox team = (JCheckBox) createTournamentUI.teams.getAccessibleContext().getAccessibleChild(i);
                if (team.isSelected()) {
                    newTournament.addTeam(tournamentSystem.getTeamMap().get(team.getText()));
                }
            }
            if (newTournament.getParticipants().size() < 2) {
                JOptionPane.showMessageDialog(new JOptionPane(),
                        "Добавь команд в турнир.",
                        "Ошибка", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if (newTournament.getName() == "") {
                JOptionPane.showMessageDialog(new JOptionPane(),
                        "Напиши название турнира.",
                        "Ошибка", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            for (int i = 0; i < newTournament.getParticipants().size(); i++) {
                if (!sportType.checkTeam(newTournament.getParticipants().get(i))) {
                    errorSport();
                    return;
                }
            }



            try {
                TournamentUI t = new TournamentUI(newTournament);
            } catch (NoSuchFieldException ex) {
                throw new RuntimeException(ex);
            }
        }
    }

    class ChoiceTeams implements ActionListener {
        TournamentSystem tournamentSystem;
        Container container;

        public ChoiceTeams(TournamentSystem tournamentSystem, Container container) {
            this.tournamentSystem = tournamentSystem;
            this.container = container;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            teams.removeAll();
            if (e.getSource() == radioButtonBasketball) {
                tournamentSystem.getTeams().forEach((Team team) -> {
                    if (team.getSportType().getNameSport() == "Basketball") {
                        teams.add(new JCheckBox(team.getTeamName()));
                    }
                });

            } else if (e.getSource() == radioButtonFootball) {

                tournamentSystem.getTeams().forEach((Team team) -> {
                    if (team.getSportType().getNameSport() == "Football") {
                        teams.add(new JCheckBox(team.getTeamName()));
                    }
                });
            } else {
                tournamentSystem.getTeams().forEach((Team team) -> {
                    if (team.getSportType().getNameSport() == "Hokey") {
                        teams.add(new JCheckBox(team.getTeamName()));
                    }
                });
            }
            teams.updateUI();
        }
    }
}


