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

        Player Max = new Player("Max N", 37, spirit);
        Player Oleg = new Player("Oleg Mongol", 38, spirit);

//        System.out.println(Max.getPlayerName());
//        Max.setSkill(1000);
//        System.out.println(Max.getSkill());
//        System.out.println(Max.getMatches());
//        spirit.addPlayerByName(Max);
//        spirit.addPlayerByName(Oleg);
//        spirit.deletePlayerByName(Max);
//        ArrayList<Player> a = spirit.getPlayers();
//        for (int i = 0; i < a.size(); i++) {
//            System.out.println(a.get(i).getPlayerName());
//        }

        virtus.addPlayerByName(Max);
        spirit.addPlayerByName(Oleg);
        Match b = new Match(spirit, virtus);
        System.out.println(b.whoWins());
    }
}