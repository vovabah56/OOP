import javax.swing.*;
import java.util.Vector;

public abstract class TournamentGrid {
    private Integer gridSize;
    protected Integer numberOfRounds;
    protected Vector<Vector<String>> resultMatchs = new Vector<Vector<String>>();
    protected Boolean isFinished;
    JTable gridUI;
    protected Vector<Vector<Match>> matchs;
    public Boolean getFinished() {
        return isFinished;
    }

    public Integer getGridSize() {
        return gridSize;
    }

    public abstract Vector<Vector<Match>> generateGrid(Tournament tournament);

    public JTable generateGridUI(){
        return new JTable();
    }


    public abstract JTable generateGridUI(Tournament tournament);
    public abstract void setResultInGrid();
    public abstract String getWinner();
}

