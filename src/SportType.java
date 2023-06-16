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

class Football extends SportType {
    int howManyOnTeam = 11;
    int sportID = 1;
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