import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TournamentSystem {
    private static JFrame jFrame = new JFrame();
    private ArrayList<Tournament> tournaments = new ArrayList<>();
    private ArrayList<Player> players = new ArrayList<>();
    private ArrayList<Team> teams = new ArrayList<>();
    private Map<String, Team> teamMap = new HashMap<>();
    public void displayTournamentSystem(){
        getJFrame();
    }

    public static JFrame getJFrame() {

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
    public void addTeam(Team team){
        teamMap.put(team.getTeamName(), team);
        teams.add(team);
    }

    public Map<String, Team> getTeamMap() {
        return teamMap;
    }

    public ArrayList<Team> getTeams() {
        return teams;
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
