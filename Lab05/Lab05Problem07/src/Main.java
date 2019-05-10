import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Main extends JFrame {
    private Main() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY);

        panel.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent e) {
                setTitle(e.getX() + ", " + e.getY());
            }
        });

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