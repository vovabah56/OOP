import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class OlympicGrid extends TournamentGrid {

    @Override
    public void generateGrid(Tournament tournament) {
        int numPlayers = tournament.getParticipants().size();

        setGridSize((int) (Math.log(numPlayers) / Math.log(2)));


        resultMatchs.add(tournament.getParticipants());
        matches.add(new Vector<>());
        for (int i = 0; i < gridSize; i++) {
            Vector<Team> currentRound = resultMatchs.get(i);
            Vector<Team> nextRound = new Vector<>();

            for (int j = 0; j < currentRound.size(); j += 2) {
                Team player1 = currentRound.get(j);
                if (j + 1 == currentRound.size()) {
                    if (i == gridSize - 1) {
                        Team player2 = matches.get(0).get(matches.size() - 1).defineWins();

                        Match matchResult = new Match(player1, player2);
                        player1.addMatch(matchResult);
                        player2.addMatch(matchResult);

                        matches.get(0).add(matchResult);
                        nextRound.add(matchResult.defineWins());
                    } else {
                        nextRound.add(player1);
                        Team loser = new Team("---", null, "");
                        Match matchResult = new Match(player1, loser);
                        matches.get(0).add(matchResult);
                    }

                } else {
                    Team player2 = currentRound.get(j + 1);

                    Match matchResult = new Match(player1, player2);
                    player1.addMatch(matchResult);
                    player2.addMatch(matchResult);

                    matches.get(0).add(matchResult);
                    nextRound.add(matchResult.defineWins());
                }
            }
            resultMatchs.add(nextRound);
        }
        isFinished = true;
    }


    @Override
    public String getWinner() {

        return resultMatchs.get(resultMatchs.size() - 1).get(0).getTeamName();
    }
}
