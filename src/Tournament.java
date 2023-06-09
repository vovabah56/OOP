import javax.lang.model.element.Name;
import java.util.*;

public class Tournament {
    private Boolean isFinished;
    private ArrayList<Team> Participants;

    private SportType sportType;


    private String name;

    private ArrayList<Match> Matchs;      //НОВОЕ СВОЙСТВО - ВСЕ ИГРЫ ЗА ТУРНИР

    /*private TournamentGrid grid;*/

    public Tournament(String name, SportType sportType) {
        this.name = name;
        this.sportType = sportType;
        this.isFinished = false;
        this.Participants = new ArrayList<Team>();
        this.Matchs = new ArrayList<Match>();
    }

    public Boolean getFinished() {
        return isFinished;
    }

    public ArrayList<Team> getParticirants() {
        return Participants;
    }

    public ArrayList<Match> getMatchs() {
        return Matchs;
    }

    public String getName() {
        return name;
    }

    public void addTeam(Team team) {
        if (Participants.contains(team)) return;
        Participants.add(team);
    }

    public void removeTeam(Team team) {
        if(Participants.contains(team)) {
            Participants.remove(team);
        }
    }

    public void setSport(SportType sportType) {
        this.sportType = sportType;
    }

    public void addMatch(Match match) {
        if (Matchs.contains(match)) return;
        Matchs.add(match);
    }


    // Временно, пока нет сеток
    public Team getWinner() {
        ArrayList<Integer> cntWin = new ArrayList<>(Participants.size());

        for (int i = 0; i < Participants.size(); i++) {
            cntWin.add(0);
        }

        // проходим по всем матчам и увеличиваем значение в индексе победителя
        for (int i = 0; i < Matchs.size(); i++) {
            int t = cntWin.get(Participants.indexOf(Matchs.get(i).whoWins()));
            cntWin.set(Participants.indexOf(Matchs.get(i).whoWins()), t + 1);

        }

        // возвращаем команду с наибольшим количеством побед
        return Participants.get(cntWin.indexOf(Collections.max(cntWin)));
    }


}
