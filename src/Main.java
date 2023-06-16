import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Team virtus = new Team("Virtus_Pro", "img/Virtus.proLogo.png", "My mind is empty, i dont understand anythink");

//        virtus.getLogo();
//        System.out.println(virtus.getTeamName());
//        System.out.println(virtus.getDescription());
//        virtus.setDescription("I love your house");
//        System.out.println(virtus.getDescription());

        Team spirit = new Team("Team_Spirit", "img/teamSpirit.jpg", "Winner TI10");
        Team spirit2 = new Team("Team_Spirit2", "img/teamSpirit.jpg", "2Winner TI10");
        Team spirit3 = new Team("Team_Spirit3", "img/teamSpirit.jpg", "3Winner TI10");
        Team spirit4 = new Team("Team_Spirit4", "img/teamSpirit.jpg", "4Winner TI10");
        Team spirit5 = new Team("Team_Spirit55", "img/teamSpirit.jpg", "4Winner T0i0I10");

        Player Max = new Player("Max N", 37, spirit);
        Player Oleg = new Player("Oleg Mongol", 38, spirit);


        virtus.addPlayerByName(Max);
        spirit.addPlayerByName(Oleg);


        Tournament tournament;
        tournament = new Tournament("firstTournament", new  Football(), new RoundRobinGrid());
        tournament.addTeam(spirit);
        tournament.addTeam(spirit2);
        tournament.addTeam(spirit3);
        tournament.addTeam(spirit4);
        tournament.addTeam(spirit5);
        tournament.addTeam(virtus);
        TournamentSystem tournamentSystem = new TournamentSystem();
        tournamentSystem.addTournament(tournament);
//       tournamentSystem.displayTournamentSystem();
        tournament.displayTournament();




    }
}