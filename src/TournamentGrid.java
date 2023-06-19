import javax.swing.*;
import java.util.Vector;

public abstract class TournamentGrid {
    private Integer gridSize;

    protected Vector<Vector<String>> resultMatchs = new Vector<Vector<String>>();
    protected Boolean isFinished;

    protected Vector<Vector<Match>> matches = new Vector<>();
    public Boolean getFinished() {
        return isFinished;
    }

    public Integer getGridSize() {
        return gridSize;
    }

    public abstract Vector<Vector<Match>> generateGrid(Tournament tournament);

    public abstract String getWinner();
}

