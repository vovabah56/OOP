import javax.swing.*;
import java.util.Vector;

public class SingleElimination extends TournamentGrid{

    private Team winTeam;

    @Override
    public void generateGrid(Tournament tournament) {
        Vector<Team> res = new Vector<>();
        Team lastWinner = new Team(null, null, null);
        Match lastMatch;

        for(Team team: tournament.getParticipants()){
            lastMatch = new Match(lastWinner, team);
            lastWinner = lastMatch.getWinner();
            res.add(lastWinner);
        }
        res.remove(0);
        winTeam = lastWinner;
        System.out.println(res);

        resultMatchs.add(res);
    }


    @Override
    public String getWinner() {
        return winTeam.getTeamName();
    }
}
