

import java.io.IOException;
import java.util.*;

public class Tournament {
    private Boolean isFinished;
    private Vector<Team> Participants;
    public Vector<String> teamsName = new Vector<>();
    private final TournamentGrid grid;
    private final SportType sportType;

    private String name;

    private ArrayList<Match> Matchs;      //НОВОЕ СВОЙСТВО - ВСЕ ИГРЫ ЗА ТУРНИР


    public Tournament(String name, SportType sportType, TournamentGrid grid) {
        this.name = name;
        this.sportType = sportType;
        this.isFinished = false;
        this.Participants = new Vector<>();
        this.Matchs = new ArrayList<Match>();
        this.grid = grid;

    }

    public Boolean getFinished() {
        return isFinished;
    }

    public Vector<Team> getParticipants() {
        return Participants;
    }

    public ArrayList<Match> getMatchs() {
        return Matchs;
    }

    public String getName() {
        return name;
    }

    public TournamentGrid getGrid() {
        return grid;
    }

    public void addTeam(Team team) {
        if (Participants.contains(team)) return;
        Participants.add(team);

        if (teamsName.isEmpty()) {
            teamsName.add("  ");
            teamsName.add(team.getTeamName());
        } else {
            teamsName.add(team.getTeamName());
        }
    }

    public void removeTeam(Team team) {
        if (Participants.contains(team)) {
            Participants.remove(team);
        }
    }

    public Boolean checkParticipants(){
        for(int i = 0; i < Participants.size(); i++){
            if(!sportType.checkTeam(Participants.get(i))) return false;
        }
        return true;
    }


    public void addMatch(Match match) {
        if (Matchs.contains(match)) return;
        Matchs.add(match);
    }


    public void startTour() throws IOException {

        grid.generateGrid(this);
        isFinished = true;
    }
}
