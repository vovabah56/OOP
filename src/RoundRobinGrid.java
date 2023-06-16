import javax.swing.*;
import java.util.Vector;


public class RoundRobinGrid extends TournamentGrid {

    Vector<Vector> cntWinForTeams = new Vector<>();


    @Override
    public Vector<Vector<Match>> generateGrid(Tournament tournament) {

        cntWinForTeams.add(new Vector<String>());
        cntWinForTeams.add(new Vector<>());
        for (int i = 0; i < tournament.getParticipants().size(); i++) {
            Vector matchsForTeam = new Vector<>();
            cntWinForTeams.get(0).add(tournament.getParticipants().get(i).getTeamName());
            cntWinForTeams.get(1).add(0);

            for (int j = 0; j < tournament.getParticipants().size(); j++) {
                if (j < i) {
                    matchsForTeam.add(matches.get(j).get(i));
                } else if (i == j) {
                    matchsForTeam.add(new Match(tournament.getParticipants().get(i), tournament.getParticipants().get(j)));

                } else {
                    Match matchIJ = new Match(tournament.getParticipants().get(i), tournament.getParticipants().get(j));
                    matchsForTeam.add(matchIJ);
                }

            }
            matches.add(matchsForTeam);
        }
        for (int i = 0; i < matches.size(); i++) {
            Vector name = new Vector<>();
            for (int j = 0; j < matches.size(); j++) {
                if (j < i) {

                    name.add(resultMatchs.get(j).get(i));
                } else if (i == j) {
                    name.add("---");
                } else {
                    name.add(matches.get(i).get(j).getWinner().getTeamName());
                    int indWinner = cntWinForTeams.get(0).indexOf(matches.get(i).get(j).getWinner().getTeamName());
                    cntWinForTeams.get(1).set(indWinner, (Integer) cntWinForTeams.get(1).get(indWinner) + 1);
                }
            }
            resultMatchs.add(name);
        }
        return matches;
    }


    @Override
    public JTable generateGridUI(Tournament tournament) {
        Vector<Vector<String>> a = new Vector<>();


        for (int i = 0; i < tournament.teamsName.size(); i++) {
            Vector<String> vasyan_info = new Vector<>();

            vasyan_info.add(tournament.teamsName.get(i));

            for (int j = 0; j < tournament.getParticipants().size() + 1; j++) {
                if (i == 0 && j < tournament.getParticipants().size()) {

                    vasyan_info.add(tournament.getParticipants().get(j).getTeamName());
                } else {
                    if (i == j + 1) {
                        vasyan_info.add("---");
                    } else {
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
        for (int i = 0; i < matches.size(); i++) {
            for (int j = 0; j < matches.size(); j++) {
                gridUI.setValueAt(resultMatchs.get(i).get(j), i + 1, j + 1);
            }

        }
    }

    @Override
    public String getWinner() {
        int indWinner = 0;
        for (int i = 1; i < cntWinForTeams.get(0).size(); i++) {
            indWinner = (Integer) cntWinForTeams.get(1).get(i) > (Integer) cntWinForTeams.get(1).get(indWinner) ? i : indWinner;
            System.out.println(cntWinForTeams.get(1).get(i));
        }

        return (String) cntWinForTeams.get(0).get(indWinner);
    }
}
