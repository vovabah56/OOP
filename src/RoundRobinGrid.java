import java.util.ArrayList;
import java.util.Vector;


public class RoundRobinGrid extends TournamentGrid {

    public Vector<Vector> matchs = new Vector<>();
    private ArrayList<ArrayList<Team>> resultMatchs = new ArrayList<ArrayList<Team>>();

    private ArrayList<Integer> forWinner;


    @Override
    public void generateGrid(Tournament tournament) {
        super.generateGrid(tournament);
        for (int i = 0; i < tournament.getParticirants().size(); i++) {
            Vector matchsForTeam = new Vector<>(tournament.getParticirants().size());
            for (int j = 0; j < tournament.getParticirants().size(); j++){
                if(j< i){
                    matchsForTeam.add(matchs.get(j).get(i));
                }
                if(i == j){
                    matchsForTeam.add("0");
                    continue;
                }
                Match matchIJ = new Match(tournament.getParticirants().get(i), tournament.getParticirants().get(j));
                matchsForTeam.add(matchIJ);
            }
            matchs.add(matchsForTeam);
        }

    }

    /*public void startTournament(Tournament tournament){
        for (int i = 0; i < tournament.getParticirants().size(); i++) {
            resultMatchs.add(new ArrayList<Team>(tournament.getParticirants().size()-i));
            for (int j = i+1; j< tournament.getParticirants().size();j++){
                resultMatchs.get(i).add(matchs.get(i).get(j).whoWins());
                matchs.get(i).get(j).getTeamFirst().addMatch(matchs.get(i).get(j));
                matchs.get(i).get(j).getTeamSecond().addMatch(matchs.get(i).get(j));
            }
        }
    }*/

    public void   whoWins(Tournament tournament){
        forWinner = new ArrayList<Integer>(tournament.getParticirants().size());
        for (int i = 0; i < forWinner.size(); i++){
            forWinner.set(i, 0);
        }
        for (int i = 0; i < tournament.getParticirants().size(); i++) {

            for (int j = i+1; j< tournament.getParticirants().size();j++){

            }
        }
    }

}
