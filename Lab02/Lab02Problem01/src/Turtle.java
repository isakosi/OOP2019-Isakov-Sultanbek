public class Turtle {
    // State

    private int x, y;
    private int dx, dy;
    private boolean isPenDown;

    //Behaviour
    Turtle() {
        x = y = 0;
        dx = 1;
        dy = 0;
        isPenDown = false;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    void putPenUp() {
        isPenDown = false;
    }

    void putPenDown() {
        isPenDown = true;
    }


    void turnLeft() {
        int t = dx;
        dx = dy;
        dy = t;

        dy = -dy;
    }

    void turnRight() {
        int t = dx;
        dx = dy;
        dy = t;

        dx = -dx;
    }

    void move(int steps, Field field) {
        for (int i = 0; i < steps; i++) {
            int nextX = x + dx;
            int nextY = y + dy;

            if (nextX < 0 || nextX >= Field.WIDTH ||
                    nextY < 0 || nextY >= Field.HEIGHT) {
                break;
            }
            if (isPenDown) {
                field.mark(x, y);
            }
            x = nextX;
            y = nextY;
        }
    }
}