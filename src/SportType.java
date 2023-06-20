import java.util.ArrayList;
import java.util.Vector;

public abstract class SportType {
    private int howManyOnTeam;
    private double timeOnGame;
    public String nameSport;
    public int getHowManyOnTeam() {
        return howManyOnTeam;
    }

    public double getTimeOnGame() {
        return timeOnGame;
    }
    abstract public boolean checkTeam(Team team);
    abstract public String getNameSport();

}

class Football extends SportType{
    int howManyOnTeam = 11;

    double timeOnGame = 90.0;
    @Override
    public boolean checkTeam(Team team) {
        Vector<Player> arrayPlayers = team.getPlayers();
        if(arrayPlayers.size() < 11){
            return false;
        }
        for(int i = 0; i < team.getPlayers().size(); i++) {
            Player player = arrayPlayers.get(i);
            if (!(player.getSport() instanceof Football)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String getNameSport() {
        return "Football";
    }


}

class Hockey extends SportType{
    int howManyOnTeam = 6;
    double timeOnGame = 60.0;
    @Override
    public boolean checkTeam(Team team) {
        Vector<Player> arrayPlayers = team.getPlayers();
        if(arrayPlayers.size() < 6){
            return false;
        }
        for(int i = 0; i < team.getPlayers().size(); i++) {
            Player player = arrayPlayers.get(i);
            if (!(player.getSport() instanceof Hockey)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String getNameSport() {
        return "Hokey";
    }
}

class Backetball extends SportType{
    int howManyOnTeam = 5;
    double timeOnGame = 48.0;
    @Override
    public boolean checkTeam(Team team) {
        Vector<Player> arrayPlayers = team.getPlayers();
        if(arrayPlayers.size() < 5){
            return false;
        }
        for(int i = 0; i < team.getPlayers().size(); i++) {
            Player player = arrayPlayers.get(i);
            if (!(player.getSport() instanceof Backetball)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String getNameSport() {
        return "Basketball";
    }
}
