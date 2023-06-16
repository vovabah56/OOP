import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Team {
    private String teamName;
    private String logo;
    private String description;
    private ArrayList<Player> players;
    private ArrayList<Match> matches;

    public Team(String teamName, String logo, String description) {
        this.teamName = teamName;
        this.logo = logo;
        this.description = description;
        this.players = new ArrayList<Player>();
        this.matches = new ArrayList<Match>();
    }


    public String getTeamName() {
        return teamName;
    }

    public void getLogo() throws IOException {
        BufferedImage image = ImageIO.read(new File(this.logo));
        Image logo =  image.getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        JLabel picLabel = new JLabel(new ImageIcon(logo));
        JPanel jPanel = new JPanel();
        jPanel.add(picLabel);
        JFrame display = new JFrame();
        display.setSize(600, 600);
        display.add(jPanel);
        display.setVisible(true);
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Передает сам массив игроков команды, для печати используем for в main(костыль для теста)
    public ArrayList<Player> getPlayers() {
        return players;
    }
//Надо писать везде в функциях this.### или можно просто вызов переменной. То есть так:
//    public void addPlayerByName(Player player) {
//        this.players.add(player);
//    }
//
//    public void deletePlayerByName(Player player) {
//        this.players.remove(player);
//    }
// Или так?
    public void addPlayerByName(Player player) {
        players.add(player);
    }

    public void deletePlayerByName(Player player) {
        players.remove(player);
    }

    public ArrayList<Match> getMatches() {
        return matches;
    }
    public void addMatch(Match match){
        if(matches.contains(match)) return;
        matches.add(match);
    }

    /*public JComponent displayTeam() {
        JComponent teamD = new Box(BoxLayout.X_AXIS);
        Image image = new ImageIcon("img/teamSpirit.jpg").getImage();

        teamD.add(image);

        return teamD;
    }*/
}
