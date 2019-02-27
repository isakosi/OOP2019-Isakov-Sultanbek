public class Field {
    //State
    final static int WIDTH = 20,
                     HEIGHT = 20;
    private final static char MARKED_CELL = '*';
    private final static char EMPTY_CELL = '.';
    private final static char TURTLE_CELL = 'T';

    private char[][] data;

    //Behaviour
    Field() {
        data = new char[HEIGHT][WIDTH];
        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
                data[y][x] = EMPTY_CELL;
            }
        }
    }

    void print(Turtle turtle) {
        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
                if (x == turtle.getX() && y == turtle.getY()) {
                     System.out.print(TURTLE_CELL);
                   } else {
                System.out.print(data[y][x]);
                }
            }
            System.out.println();
        }
    }
    void mark(int x,int y){
        data[y][x] = MARKED_CELL;

    }
}
