import javax.swing.*;
import java.util.Vector;


public class RoundRobinGrid extends TournamentGrid {

    Vector<Vector> cntWinForTeams = new Vector<>();


    @Override
    public void generateGrid(Tournament tournament) {

        cntWinForTeams.add(new Vector<String>());
        cntWinForTeams.add(new Vector<>());
        for (int i = 0; i < tournament.getParticipants().size(); i++) {

            Vector<Match> matchsForTeam = new Vector<>();

            Vector<Team> nameWinners = new Vector<>();
            for (int j = 0; j < tournament.getParticipants().size(); j++) {
                cntWinForTeams.get(0).add(tournament.getParticipants().get(j).getTeamName());

                cntWinForTeams.get(1).add(0);
                if (j < i) {
                    matchsForTeam.add(matches.get(j).get(i));
                    nameWinners.add(resultMatchs.get(j).get(i));
                } else {
                    Team firstTeam = tournament.getParticipants().get(i);
                    Team secondTeam = tournament.getParticipants().get(j);

                    Match match = new Match(firstTeam, secondTeam);
                    matchsForTeam.add(match);

                    firstTeam.addMatch(match);
                    secondTeam.addMatch(match);

                    nameWinners.add(i == j ? new Team("---", null, null) : match.getWinner());
                    int indWinner = cntWinForTeams.get(0).indexOf(match.getWinner().getTeamName());

                    cntWinForTeams.get(1).set(indWinner, (Integer) cntWinForTeams.get(1).get(indWinner) + 1);
                }

            }
            matches.add(matchsForTeam);
            resultMatchs.add(nameWinners);
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
