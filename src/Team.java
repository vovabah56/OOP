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

    public void displayLogo(JPanel) throws IOException {
        BufferedImage image = ImageIO.read(new File(this.logo));
        Image logo =  image.getScaledInstance(500, 500, Image.SCALE_DEFAULT);
        JLabel picLabel = new JLabel(new ImageIcon(logo));
        JPanel jPanel = new JPanel();
        jPanel.add(picLabel);
        JFrame display = new JFrame();
        display.setSize(600, 600);
        display.add(jPanel);
        display.setVisible(true);
    }
//    передавать jpanel, координаты, размер
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

    public void addPlayerByName(Player player) {
        players.add(player);
    }

    public void deletePlayerByName(Player player) {
        players.remove(player);
    }

    public ArrayList<Match> getMatches() {
        return matches;
    }

    public int getPower() {
        int power = 0;

        for (int i = 0; i < players.size(); ++i) {
            power += players.get(i).getSkill();
        }
        return power;
    }
}
