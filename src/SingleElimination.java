import javax.swing.*;
import java.util.Vector;

public class SingleElimination extends TournamentGrid{

    private Team winTeam;

    @Override
    public Vector<Vector<Match>> generateGrid(Tournament tournament) {
        Vector<String> res = new Vector<>();
        Match lastMatch = new Match(tournament.getParticipants().get(0), tournament.getParticipants().get(1));

        for (int i = 1; i < tournament.getParticipants().size(); i++){
            Team win = lastMatch.getWinner();
            res.add(win.getTeamName());
            lastMatch = new Match(win, tournament.getParticipants().get(i));
        }
        resultMatchs.add(res);
        return matches;

    }


    @Override
    public String getWinner() {
        return resultMatchs.get(0).get(resultMatchs.size()-1);
    }
}
