import javax.swing.*;
import java.util.Vector;

public class SingleElimination extends TournamentGrid{

    private Team winTeam;

    @Override
    public Vector<Vector<Match>> generateGrid(Tournament tournament) {
        Vector<Match> m = new Vector<Match>();
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
    public JTable generateGridUI(Tournament tournament) {
        Vector<Vector<String>> a = new Vector<Vector<String>>();

        for (int i = 0; i < 2; i++){
            Vector vasyan_info = new Vector();

            vasyan_info.add(tournament.teamsName.get(i));

            for (int j = 0; j < tournament.getParticipants().size()+1; j++){
                if(i == 0 && j < tournament.getParticipants().size()){
                    vasyan_info.add(tournament.getParticipants().get(j).getTeamName());
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
        isFinished =true;

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
        return resultMatchs.get(0).get(resultMatchs.size()-1);
    }
}
