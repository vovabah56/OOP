import javax.swing.*;
import java.util.Vector;

public abstract class TournamentGrid {
    protected Integer gridSize;

    protected Vector<Vector<Team>> resultMatchs = new Vector<>();
    protected Boolean isFinished;
    protected Vector<Vector<Match>> matches = new Vector<>();

    public Boolean getFinished() {
        return isFinished;
    }

    public Integer getGridSize() {
        return gridSize;
    }

    public void setGridSize(Integer gridSize) {
        this.gridSize = gridSize;
    }

    public abstract void generateGrid(Tournament tournament);

    public abstract String getWinner();
}

