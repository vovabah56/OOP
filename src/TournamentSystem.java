import java.util.ArrayList;

public class TournamentSystem {

    private ArrayList<Tournament> tournaments;

    public void createTournament(String name, SportType sportType){
        tournaments.add(new Tournament(name, sportType));
    }

    public void generateGrid(Tournament tournament){
        // абракадабра сим салабим

        return ;
    }

    public ArrayList<Match> getGames(Tournament tournament){
        return tournament.getMatchs();
    }



}
