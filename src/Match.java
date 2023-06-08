import java.util.ArrayList;
import java.util.Random;

public class Match {
    private SportType sport;
    private Team teamFirst;
    private Team teamSecond;
    private ArrayList<Integer> arrayScore = new ArrayList<Integer>();

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

    public ArrayList<Integer> getArrayScore() {
        return arrayScore;
    }

    public String whoWins() {
        int powerFirstTeam = 0;
        int powerSecondTeam = 0;

        for (int i = 0; i < teamFirst.getPlayers().size(); ++i) {
            powerFirstTeam += teamFirst.getPlayers().get(i).getSkill();
        }

        for (int i = 0; i < teamSecond.getPlayers().size(); ++i) {
            powerSecondTeam += teamSecond.getPlayers().get(i).getSkill();
        }
        int randomNumberFirst = new Random().ints(1, 6).findFirst().getAsInt();
        powerFirstTeam = powerFirstTeam * randomNumberFirst;

        int randomNumberSecond = new Random().ints(1, 6).findFirst().getAsInt();
        powerSecondTeam = powerSecondTeam * randomNumberSecond;


        if (powerFirstTeam > powerSecondTeam) {
            return teamFirst.getTeamName();
        } else {
            return teamSecond.getTeamName();
        }
    }
}
