import java.util.ArrayList;
import java.util.Random;

import static java.lang.Math.abs;

public class Match {
    private SportType sport;
    private Team teamFirst;
    private Team teamSecond;
    private ArrayList<Integer> arrayScore = new ArrayList<Integer>();
    private Team winner = null;

    public Match(Team teamFirst, Team teamSecond) {
        this.teamFirst = teamFirst;
        this.teamSecond = teamSecond;
        this.arrayScore = new ArrayList<Integer>();
    }
    public SportType getSport() {
        return sport;
    }

    public Team getTeamFirst() {
        return teamFirst;
    }

    public Team getTeamSecond() {
        return teamSecond;
    }

    public Team getWinner() {
        if(winner == null) return defineWins();
        return winner;
    }

    public ArrayList<Integer> getArrayScore() {
        return arrayScore;
    }

    private int randomizePower(int power, int min, int max) {
        int randomNumber = new Random().ints(min, max).findFirst().getAsInt();
        return power * randomNumber;
    }

    public Team defineWins() {

        int powerFirstTeam = randomizePower(teamFirst.getPower(), 1, 6);
        int powerSecondTeam = randomizePower(teamSecond.getPower(), 1, 6);


        if (powerFirstTeam > powerSecondTeam) {
            winner =teamFirst;
            return teamFirst;
        } else {
            winner = teamSecond;
            return teamSecond;
        }
    }
}
