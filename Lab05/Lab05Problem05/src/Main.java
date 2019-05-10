import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Main extends JFrame {

    class PanelMouseMotionListener implements MouseMotionListener {

        public void mouseDragged(MouseEvent e) {
        }

        public void mouseMoved(MouseEvent e) {
            setTitle(e.getX() + ", " + e.getY());

        }
    }

   private Main() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY);

        panel.addMouseMotionListener(new PanelMouseMotionListener());
        setLayout(new BorderLayout());
        add(panel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        JFrame frame = new Main();
        frame.setTitle("");
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
