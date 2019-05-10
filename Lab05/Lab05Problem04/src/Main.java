import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    Main() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.RED);
        JPanel toolBar = new JPanel();
        toolBar.setBackground(Color.DARK_GRAY);

        JButton redB = new JButton("RED");
        redB.addActionListener(e -> panel.setBackground(Color.RED));

        JButton greenB = new JButton("GREEN");
        greenB.addActionListener((e -> panel.setBackground(Color.GREEN)));

        JButton blueB = new JButton("BLUE");
        blueB.addActionListener((e -> panel.setBackground(Color.BLUE)));

        setLayout(new BorderLayout());
        add(panel, BorderLayout.CENTER);

        toolBar.add(redB);
        toolBar.add(greenB);
        toolBar.add(blueB);

        add(toolBar, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        JFrame frame = new Main();
        frame.setTitle("Fisrt GUI App");
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
