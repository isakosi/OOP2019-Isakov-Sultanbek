import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main extends JFrame {

    class LevelPanel extends JPanel {

        private View levelView;

        LevelPanel(Level level) {
            levelView = new LevelSwingView(level);
        }

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            levelView.present(g, getWidth(), getHeight());


        }
    }

    private ArrayList<Level> levels;


    Main(ArrayList<Level> levels) {
        this.levels = levels;

        //TODO: game logic...
        JPanel levelPanel = new LevelPanel(levels.get(0));
        levelPanel.setBackground(Color.WHITE);
        add(levelPanel);
    }


    public static void main(String[] args) {
        try {
            ArrayList<Level> levels = Utils.loadLevels("levels.txt");

            JFrame frame = new Main(levels);
            frame.setSize(900, 700);
            frame.setTitle("Sokoban");
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setVisible(true);

        } catch (LevelFileNotFound e) {
            System.err.println(e.getMessage());
        }
    }
    //TODO: draw the player
    //TODO: draw the boxes
}
