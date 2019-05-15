import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main extends JFrame {
    class ButtonActionListener implements ActionListener {
        private JPanel panel;
        private Color color;

        ButtonActionListener(JPanel panel, Color color) {
            this.panel = panel;
            this.color = color;
        }

        public void actionPerformed(ActionEvent e) {
            panel.setBackground(color);
        }
    }

    Main() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.RED);
        JPanel toolBar = new JPanel();
        toolBar.setBackground(Color.DARK_GRAY);
        JButton redB = new JButton("RED");
        redB.addActionListener(new ButtonActionListener(panel,Color.RED));
        JButton greenB = new JButton("GREEN");
        greenB.addActionListener(new ButtonActionListener(panel, Color.GREEN));
        JButton blueB = new JButton("BLUE");
        blueB.addActionListener(new ButtonActionListener(panel, Color.BLUE));
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
