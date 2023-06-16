import javax.swing.*;
import java.util.ArrayList;
import java.util.Vector;

public class SingleElimination extends TournamentGrid{

    private Team winTeam;

    /*@Override
    public void generateGrid(Tournament tournament){
        winTeam = tournament.getParticirants().get(0);
        numberOfRounds = tournament.getParticirants().size();

        for (int i = 1; i < numberOfRounds; i++){
            Match match = new Match(winTeam, tournament.getParticirants().get(i));
            winTeam = match.defineWins();
        }
        isFinished = true;
        return null;
        return null;
    }*/


    @Override
    public Vector<Vector<Match>> generateGrid(Tournament tournament) {
        Vector<Match> m = new Vector<Match>();
        Vector<String> res = new Vector<>();
        Match lastMatch = new Match(tournament.getParticirants().get(0), tournament.getParticirants().get(1));

        for (int i = 1; i < tournament.getParticirants().size(); i++){
            Team win = lastMatch.defineWins();
            res.add(win.getTeamName());
            lastMatch = new Match(win, tournament.getParticirants().get(i));
        }
        resultMatchs.add(res);
        return matchs;

    }

    @Override
    public JTable generateGridUI(Tournament tournament) {
        Vector<Vector<String>> a = new Vector<Vector<String>>();


        for (int i = 0; i < 2; i++){
            Vector vasyan_info = new Vector();

            vasyan_info.add(tournament.teamsName.get(i));

            for (int j = 0; j < tournament.getParticirants().size()+1; j++){
                if(i == 0 && j < tournament.getParticirants().size()){
                    vasyan_info.add(tournament.getParticirants().get(j).getTeamName());
                }
                else{
                    if(i == j+1){
                        vasyan_info.add("---");
                    }
                    else{
                        vasyan_info.add("0");
                    }
                }
            }
            a.add(vasyan_info);
        }
        gridUI = new JTable(a, tournament.teamsName);


        return gridUI;
    }

    @Override
    public void setResultInGrid() {
        for (int j = 0; j < resultMatchs.get(0).size(); j++){
            gridUI.setValueAt(resultMatchs.get(0).get(j), 1, j+2);
        }
    }

    @Override
    public String getWinner() {
        return null;
    }
}
