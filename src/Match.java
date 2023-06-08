import java.util.ArrayList;

public class Match {
    private SportType sport;
    private Team teamFirst;
    private Team teamSecond;
    private ArrayList<Integer> arrayScore;

    public SportType getSport() {
        return sport;
    }

    public Team getTeamFirst() {
        return teamFirst;
    }

    public Team getTeamSecond() {
        return teamSecond;
    }

    public ArrayList<Integer> getArrayScore() {
        return arrayScore;
    }
}
