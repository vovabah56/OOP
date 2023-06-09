import java.util.ArrayList;

public class SingleElimination extends TournamentGrid{

    private Team winTeam;

    @Override
    public void generateGrid(Tournament tournament){
        winTeam = tournament.getParticirants().get(0);
        numberOfRounds = tournament.getParticirants().size();

        for (int i = 1; i < numberOfRounds; i++){
            Match match = new Match(winTeam, tournament.getParticirants().get(i));
            winTeam = match.whoWins();
        }
        isFinished = true;
    }

}
