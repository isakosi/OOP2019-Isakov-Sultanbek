import java.awt.*;


public class LevelSwingView extends LevelView {

    LevelSwingView(Level level) {
        super(level);
    }

    public void present(Object means, int width, int height) {
        Graphics g = (Graphics) means;
        Image img;

        //TODO: Move to a seperate view class
        int cellSize = Math.min(width / level.getWidth(), height / level.getHeight());
        int screenAreaWidth = level.getWidth() * cellSize;
        int screenAreaHeight = level.getHeight() * cellSize;
        int centerShiftX = (width - screenAreaWidth) / 2;
        int centerShiftY = (height - screenAreaHeight) / 2;

        char[][] statics = level.getStatics();
        for (int y = 0; y < level.getHeight(); y++) {
            for (int x = 0; x < level.getWidth(); x++) {
                char element = statics[y][x];

                int screenX = centerShiftX + x * cellSize;
                int screenY = centerShiftY + y * cellSize;

                switch (element) {

                    case Level.FLOOR_CHAR:
                        g.setColor(Color.WHITE);
                        g.fillRect(screenX, screenY, cellSize, cellSize);
                        break;
                    case Level.WALL_CHAR:
                        g.setColor(Color.DARK_GRAY);
                        g.fillRect(screenX, screenY, cellSize, cellSize);
                        break;
                    case Level.STORAGE_CHAR:
                        g.setColor(Color.WHITE);
                        g.fillRect(screenX, screenY, cellSize, cellSize);
                        g.setColor(Color.RED);
                        final float percentage = 0.2f;
                        g.fillOval(
                                (int) (screenX + cellSize * percentage),
                                (int) (screenY + cellSize * percentage),
                                (int) (cellSize - cellSize * percentage * 2.0f),
                                (int) (cellSize - cellSize * percentage * 2.0f)
                        );
                        break;
                }
            }
        }

    }
}
