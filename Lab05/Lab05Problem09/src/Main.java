import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main extends JFrame {
    Model model = new Model();
    CanvasPanel canvas = new CanvasPanel();

    Main() {
        canvas.setFocusable(true);
        add(canvas);

        canvas.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    model.tryMoveRight();
                } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    model.tryMoveLeft();
                } else if (e.getKeyCode() == KeyEvent.VK_UP) {
                    model.tryMoveUp();
                } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    model.tryMoveDown();
                }
                repaint();
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new Main();
        frame.setTitle("Move Robot");
        frame.setSize(600,600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    class CanvasPanel extends JPanel{
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            int dw = getWidth() / 8;
            int dh = getHeight() / 8;

            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    Color c;
                    if(i % 2 == 0) {
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
