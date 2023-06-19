import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Team amur = Database.amur;
        Team akBars = Database.akBars;
        Team avtomobilist = Database.avtomobilist;
        Team akronTogliatti = Database.akronTogliatti;
        Team atlantaHawks = Database.atlantaHawks;
        Team bostonCeltics = Database.bostonCeltics;
        Team cska = Database.cska;
        Team chicagoBulls = Database.chicagoBulls;
        Team denverNuggets = Database.denverNuggets;
        Team manchester = Database.manchester;
        Team krylyaSovetov = Database.krylyaSovetov;
        Team miamiHeat = Database.miamiHeat;
        Team khimki = Database.khimki;
        Team kamAZ = Database.kamAZ;
        Team lokomotiv = Database.lokomotiv;
        Team metallurg = Database.metallurg;
        Team milwaukeeBucks = Database.milwaukeeBucks;
        Team newYorkKnicks = Database.newYorkKnicks;
        Team orenburg = Database.orenburg;
        Team torontoRaptors = Database.torontoRaptors;
        Team torpedo = Database.torpedo;
        Team traktor = Database.traktor;
        Team spartak = Database.spartak;
        Team sibir = Database.sibir;

//        Team virtus = new Team("Virtus_Pro", "img/Virtus.proLogo.png", "My mind is empty, i dont understand anythink");
//        virtus.getLogo();
//        System.out.println(virtus.getTeamName());
//        System.out.println(virtus.getDescription());
//        virtus.setDescription("I love your house");
//        System.out.println(virtus.getDescription());
//        Team spirit = new Team("Team_Spirit", "img/teamSpirit.jpg", "Winner TI10");
//        Team spirit2 = new Team("Team_Spirit2", "img/teamSpirit.jpg", "2Winner TI10");
//        Team spirit3 = new Team("Team_Spirit3", "img/teamSpirit.jpg", "3Winner TI10");
//        Team spirit4 = new Team("Team_Spirit4", "img/teamSpirit.jpg", "4Winner TI10");
//        Team spirit5 = new Team("Team_Spirit55", "img/teamSpirit.jpg", "4Winner T0i0I10");
//        Player Max = new Player("Max N", new Football(), 37, spirit);
//        Player Oleg = new Player("Oleg Mongol", new Football(), 38, spirit);
//        virtus.addPlayerByName(Max);
//        spirit.addPlayerByName(Oleg);


        TournamentSystem tournamentSystem = new TournamentSystem();
        tournamentSystem.addTeam(amur);
        tournamentSystem.addTeam(akBars);
        tournamentSystem.addTeam(avtomobilist);
        tournamentSystem.addTeam(akronTogliatti);
        tournamentSystem.addTeam(atlantaHawks);
        tournamentSystem.addTeam(bostonCeltics);
        tournamentSystem.addTeam(cska);
        tournamentSystem.addTeam(chicagoBulls);
        tournamentSystem.addTeam(denverNuggets);
        tournamentSystem.addTeam(manchester);
        tournamentSystem.addTeam(krylyaSovetov);
        tournamentSystem.addTeam(miamiHeat);
        tournamentSystem.addTeam(khimki);
        tournamentSystem.addTeam(kamAZ);
        tournamentSystem.addTeam(lokomotiv);
        tournamentSystem.addTeam(metallurg);
        tournamentSystem.addTeam(milwaukeeBucks);
        tournamentSystem.addTeam(newYorkKnicks);
        tournamentSystem.addTeam(orenburg);
        tournamentSystem.addTeam(torontoRaptors);
        tournamentSystem.addTeam(torpedo);
        tournamentSystem.addTeam(traktor);
        tournamentSystem.addTeam(spartak);
        tournamentSystem.addTeam(sibir);


        Tournament tournament;
        tournament = new Tournament("firstTournament", new  Football(), new SingleElimination());

        tournament.addTeam(manchester);
        tournament.addTeam(spartak);
        tournament.addTeam(torpedo);
        tournament.addTeam(krylyaSovetov);
        tournament.addTeam(orenburg);
        tournament.addTeam(kamAZ);
        tournament.addTeam(akronTogliatti);
        tournament.addTeam(khimki);

//       tournamentSystem.displayTournamentSystem();
         Menu.MainMenu(tournamentSystem);



    }
}
