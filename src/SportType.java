import java.util.Vector;

public abstract class SportType {
    protected int cntPlayersOnTeam;

    public String nameSport;

    public int getCntPlayersOnTeam() {
        return cntPlayersOnTeam;
    }

    abstract public boolean checkTeam(Team team);

    abstract public String getNameSport();

}

class Football extends SportType {

    @Override
    public boolean checkTeam(Team team) {
        cntPlayersOnTeam = 11;
        Vector<Player> arrayPlayers = team.getPlayers();
        if (arrayPlayers.size() < cntPlayersOnTeam) {
            return false;
        }
        for (int i = 0; i < team.getPlayers().size(); i++) {
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

class Hockey extends SportType {


    @Override
    public boolean checkTeam(Team team) {
        cntPlayersOnTeam = 6;
        Vector<Player> arrayPlayers = team.getPlayers();
        if (arrayPlayers.size() < cntPlayersOnTeam) {
            return false;
        }
        for (int i = 0; i < team.getPlayers().size(); i++) {
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

class Backetball extends SportType {

    @Override
    public boolean checkTeam(Team team) {
        cntPlayersOnTeam = 5;
        Vector<Player> arrayPlayers = team.getPlayers();
        if (arrayPlayers.size() < cntPlayersOnTeam) {
            return false;
        }
        for (int i = 0; i < team.getPlayers().size(); i++) {
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
