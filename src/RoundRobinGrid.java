import java.util.ArrayList;

public class RoundRobinGrid extends TournamentGrid {

    private ArrayList<ArrayList<Match>> matchs;



    @Override
    public void generateGrid(Tournament tournament) {
        super.generateGrid(tournament);
        numberOfRounds = tournament.getParticirants().size() * (tournament.getParticirants().size() - 1) / 2;
        for (int i = 0; i < tournament.getParticirants().size(); i++) {
            matchs.add(new ArrayList<Match>(tournament.getParticirants().size()-i));
            for (int j = i+1; j< tournament.getParticirants().size();j++){
                matchs.get(i).add(new Match(tournament.getParticirants().get(i), tournament.getParticirants().get(j)));
            }
        }

    }
}
