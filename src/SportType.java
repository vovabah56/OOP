import java.util.ArrayList;

public abstract class SportType {
    private int howManyOnTeam;
    private double timeOnGame;

    public int getHowManyOnTeam() {
        return howManyOnTeam;
    }

    public double getTimeOnGame() {
        return timeOnGame;
    }
    abstract public Boolean checkTeam(Team team);

//    public boolean checkTeam(Team teamFirst, Team teamSecond) {
//        ArrayList<Player> arrayPlayersFirstTeam = teamFirst.getPlayers();
//        ArrayList<Player> arrayPlayersSecondTeam = teamSecond.getPlayers();
//
//
//    }
}

class Football extends SportType{
    int howManyOnTeam = 11;
    double timeOnGame = 90.0;
    public Boolean checkTeam(Team team) {
       ArrayList<Player> arrayPlayers = team.getPlayers();
       if(arrayPlayers.size() != 11){
           return false;
       }
        for(int i = 0; i < 11; i++) {
            Player player = arrayPlayers.get(i);
            if (!(player.getSport() instanceof Football)) {
                return false;
            }
        }
        return true;
    }
}

class Hockey extends SportType{
    int howManyOnTeam = 6;
    double timeOnGame = 60.0;
    public Boolean checkTeam(Team team) {
        ArrayList<Player> arrayPlayers = team.getPlayers();
        if(arrayPlayers.size() != 6){
            return false;
        }
        for(int i = 0; i < 6; i++) {
            Player player = arrayPlayers.get(i);
            if (!(player.getSport() instanceof Hockey)) {
                return false;
            }
        }
        return true;
    }
}

class Backetball extends SportType{
    int howManyOnTeam = 5;
    double timeOnGame = 48.0;
    public Boolean checkTeam(Team team) {
        ArrayList<Player> arrayPlayers = team.getPlayers();
        if(arrayPlayers.size() != 5){
            return false;
        }
        for(int i = 0; i < 5; i++) {
            Player player = arrayPlayers.get(i);
            if (!(player.getSport() instanceof Backetball)) {
                return false;
            }
        }
        return true;
    }
}