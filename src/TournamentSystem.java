import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TournamentSystem {
    private ArrayList<Tournament> tournaments = new ArrayList<>();
    private ArrayList<Player> players = new ArrayList<>();
    private ArrayList<Team> teams = new ArrayList<>();
    private Map<String, Team> teamMap = new HashMap<>();



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


}
