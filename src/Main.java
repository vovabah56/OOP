import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {


        TournamentSystem tournamentSystem = new TournamentSystem();
        tournamentSystem.addTeam(Database.amur);
        tournamentSystem.addTeam(Database.akBars);
        tournamentSystem.addTeam(Database.avtomobilist);
        tournamentSystem.addTeam(Database.akronTogliatti);
        tournamentSystem.addTeam(Database.atlantaHawks);
        tournamentSystem.addTeam(Database.bostonCeltics);
        tournamentSystem.addTeam(Database.cska);
        tournamentSystem.addTeam(Database.chicagoBulls);
        tournamentSystem.addTeam(Database.denverNuggets);
        tournamentSystem.addTeam(Database.manchester);
        tournamentSystem.addTeam(Database.krylyaSovetov);
        tournamentSystem.addTeam(Database.miamiHeat);
        tournamentSystem.addTeam(Database.khimki);
        tournamentSystem.addTeam(Database.kamAZ);
        tournamentSystem.addTeam(Database.lokomotiv);
        tournamentSystem.addTeam(Database.metallurg);
        tournamentSystem.addTeam(Database.milwaukeeBucks);
        tournamentSystem.addTeam(Database.newYorkKnicks);
        tournamentSystem.addTeam(Database.orenburg);
        tournamentSystem.addTeam(Database.torontoRaptors);
        tournamentSystem.addTeam(Database.torpedo);
        tournamentSystem.addTeam(Database.traktor);
        tournamentSystem.addTeam(Database.spartak);
        tournamentSystem.addTeam(Database.sibir);

       Menu.MainMenu(tournamentSystem);



    }
}
