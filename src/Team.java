import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;

public class Team {
    private String teamName;
    private String logo;
    private String description;
    private Vector<Player> players;
    private ArrayList<Match> matches;
    private SportType sportType;

    public Team(String teamName, String logo, String description) {
        this.teamName = teamName;
        this.logo = logo;
        this.description = description;
        this.players = new Vector<Player>();
        this.matches = new ArrayList<Match>();
    }

    public String getLogo() {
        return logo;
    }

    public String getTeamName() {
        return teamName;
    }

//    public void displayLogo(JPanel) throws IOException {
//        BufferedImage image = ImageIO.read(new File(this.logo));
//        Image logo =  image.getScaledInstance(100, 100, Image.SCALE_DEFAULT);
//        JLabel picLabel = new JLabel(new ImageIcon(logo));
//        JPanel jPanel = new JPanel();
//        jPanel.add(picLabel);
//        JFrame display = new JFrame();
//        display.setSize(600, 600);
//        display.add(jPanel);
//        display.setVisible(true);
//    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Vector<Player> getPlayers() {
        return players;
    }

    public void setSportType(SportType sportType) {
        this.sportType = sportType;
    }

    public Boolean addPlayerByName(Player player) {
        if (sportType == null) {
            sportType = player.getSport();
        }
        if (player.getSport().getNameSport() == sportType.getNameSport()) {
            players.add(player);
            return true;
        }
        return false;
    }

    public SportType getSportType() {
        return sportType;
    }

    public void deletePlayerByName(Player player) {
        players.remove(player);
    }

    public ArrayList<Match> getMatches() {
        return matches;
    }

    public void addMatch(Match match) {
        if (matches.contains(match)) return;
        matches.add(match);
    }


    public int getPower() {
        int power = 0;

        for (int i = 0; i < players.size(); ++i) {
            power += players.get(i).getSkill();
        }
        return power;
    }
}
