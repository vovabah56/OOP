import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class GridUI implements ActionListener {
    Tournament tournament;
    public GridUI(Tournament tournament){
        this.tournament = tournament;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            tournament.startTour();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

    }
}
