import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main extends JFrame {
    Canvas canvas = new Canvas();
    Model model = new Model();
    Main() {
        canvas.setFocusable(true);
        add(canvas);

        canvas.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_RIGHT:
                        model.turnRight();
                        break;
                    case KeyEvent.VK_LEFT:
                        model.turnLeft();
                        break;
                    case KeyEvent.VK_UP:
                        model.turnUp();
                        break;
                    case KeyEvent.VK_DOWN:
                        model.turnDown();
                        break;
                }
                repaint();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new Main();
        frame.setTitle("Chessboard");
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    class Canvas extends JPanel {
        protected void paintComponent(Graphics g) {
            int dw = getWidth() / 8;
            int dh = getHeight() / 8;

            for (int i = 0; i < 8; i++) {

                for (int j = 0; j < 8; j++) {
                    Color c;
                    if (i % 2 == 0) {
                        c = j % 2 == 0 ? Color.BLACK : Color.WHITE;
                    } else {
                        c = j % 2 == 0 ? Color.WHITE : Color.BLACK;
                    }
                    g.setColor(c);
                    g.fillRect(dw * j, dh * i, dw, dh);
                }
            }
            g.setColor(Color.RED);
            g.fillOval(dw * model.col, dh * model.row, dw, dh);
        }
    }
}