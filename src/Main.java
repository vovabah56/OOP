public class Main {
    public static void main(String[] args) {
        Player Max = new Player("Max N", 37);
        System.out.println(Max.getPlayerName());
        Max.setSkill(1000);
        System.out.println(Max.getSkill());
        System.out.println(Max.getMatches());

        Team virtus = new Team("Virtus_Pro", "My mind is empty, i dont understand anythink");
        System.out.println(virtus.getTeamName());
        System.out.println(virtus.getDescription());
        virtus.setDescription("I love your house");
        System.out.println(virtus.getDescription());


    }
}