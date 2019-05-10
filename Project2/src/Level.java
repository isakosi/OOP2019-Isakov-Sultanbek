import java.util.ArrayList;

public class Level {
    final static char FLOOR_CHAR = ' ';
    final static char WALL_CHAR = '#';
    final static char PLAYER_CHAR = '$';
    final static char BOX_CHAR = '@';
    final static char STORAGE_CHAR = '.';

    private String name;
    private Player player;
    private ArrayList<Box> boxes;
    private char[][] statics;

    Level(String name, Player player, ArrayList<Box> boxes, char[][] statics) {
        this.name = name;

        this.player = player;
        this.boxes = boxes;

        this.statics = statics;
    }

    int getWidth() {
        return statics[0].length;
    }

    int getHeight() {
        return  statics.length;
    }

    Player getPlayer() {
        return player;
    }

    ArrayList<Box> getBoxes() {
        return boxes;
    }

    char[][] getStatics() {
        return statics;
    }

    static Level parseLevel(String level) {
        //TODO: do error checking
        String[] parts = level.split(";");

        String name = parts[1].trim();
        level = parts[0];

        String rows[] = level.split("\n");
        int height = rows.length;

        int widht = rows[0].length();
        for (int i = 1; i < rows.length; i++) {
            if (rows[i].length() > widht) {
                widht = rows[i].length();
            }
        }

        Player player = null;
        ArrayList<Box> boxes = new ArrayList<>();

        char[][] statics = new char[height][widht];
        for (int y = 0; y < height; y++) {
            int x;
            for (x = 0; x < rows[y].length(); x++) {
                char element = rows[y].charAt(x);
                switch (element) {
                    case FLOOR_CHAR:
                    case WALL_CHAR:
                    case STORAGE_CHAR:
                        statics[y][x] = element;
                        break;

                    case PLAYER_CHAR:
                        statics[y][x] = FLOOR_CHAR;
                        player = new Player(x, y);
                        break;

                    case BOX_CHAR:
                        statics[y][x] = FLOOR_CHAR;
                        boxes.add(new Box(x, y));
                        break;
                }
            }
            for (; x < widht; x++) {
                statics[y][x] = FLOOR_CHAR;
            }
        }
        return new Level(name, player, boxes, statics);
    }

}
