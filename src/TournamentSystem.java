import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class TournamentSystem {

    private ArrayList<Tournament> tournaments = new ArrayList<>();

    public void displayTournamentSystem(){


    }
    public static JFrame getJFrame() {
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setSize(500, 300);
        jFrame.setTitle("Tournament System");

        JButton jButton = new JButton("Создать турнир");
        jButton.setSize(50, 20);

        Container container = jFrame.getContentPane();
        container.setSize(100, 300);
        container.setLayout(new FlowLayout());
        container.add(jButton);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return jFrame;
    }

    public void createTournament(String name, SportType sportType){
        tournaments.add(new Tournament(name, sportType, new RoundRobinGrid()));
    }

    public void generateGrid(Tournament tournament){
        // абракадабра сим салабим

        return ;
    }

    public ArrayList<Match> getMatch(Tournament tournament){
        return tournament.getMatchs();
    }

    public void addTournament(Tournament tournament){
        tournaments.add(tournament);
    }


}
