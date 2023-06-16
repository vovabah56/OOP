import javax.swing.*;
import java.util.ArrayList;
import java.util.Vector;


public class RoundRobinGrid extends TournamentGrid {

    public Vector<Vector<Match>> matchs = new Vector<>();
    private JTable gridUI;


    @Override
    public Vector<Vector<Match>> generateGrid(Tournament tournament) {
        for (int i = 0; i < tournament.getParticirants().size(); i++) {
            Vector matchsForTeam = new Vector<>();
            for (int j = 0; j < tournament.getParticirants().size(); j++) {
                if (j < i) {
                    matchsForTeam.add(matchs.get(j).get(i));
                }
                if (i == j) {
                    matchsForTeam.add(new Match(tournament.getParticirants().get(i),tournament.getParticirants().get(j)));

                }
                else{
                    Match matchIJ = new Match(tournament.getParticirants().get(i), tournament.getParticirants().get(j));
                    matchsForTeam.add(matchIJ);
                }

            }
            matchs.add(matchsForTeam);
        }
        for (int i = 0; i < matchs.size(); i++){
            Vector name = new Vector<>();
            for (int j =0; j < matchs.size(); j++){
                if (j < i) {

                    name.add(resultMatchs.get(j).get(i));
                }
                else if (i == j) {
                   name.add("---");
                }
                else{
                    name.add(matchs.get(i).get(j).defineWins().getTeamName());
                }
            }
            resultMatchs.add(name);
        }
        return matchs;
    }




    @Override
    public JTable generateGridUI( Tournament tournament) {
        Vector<Vector<String>> a = new Vector<Vector<String>>();


        for (int i = 0; i < tournament.teamsName.size(); i++){
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
        for (int i = 0; i < matchs.size(); i++) {


            for (int j = 0; j < matchs.size(); j++) {

                    gridUI.setValueAt(resultMatchs.get(i).get(j), i+1, j+1);
            }

        }
    }

    @Override
    public String getWinner() {
        return null;
    }
}
