import java.util.ArrayList;

public class Player{
    private String playerName;
    private SportType sport;
    private int skill;
    private Team team;
    private ArrayList<Match> matches;

    public Player(String playerName, SportType sport, int skill, Team team) {
        this.playerName = playerName;
        this.sport = sport;
        this.skill = skill;
        this.team = team;
        this.matches = new ArrayList<Match>();
        team.addPlayerByName(this);
    }


    public String getPlayerName() {
        return playerName;
    }

    public SportType getSport() {
        return sport;
    }

    public void setSport(SportType sport) {
        this.sport = sport;
    }

    public int getSkill() {
        return skill;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }

    public String getTeam() {
        return team.getTeamName();
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public ArrayList<Match> getMatches() {
        return matches;
    }
}
