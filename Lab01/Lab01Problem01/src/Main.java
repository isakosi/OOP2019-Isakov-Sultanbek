import java.util.Scanner;

public class Main {

    // Turtle Data
    final static char TURTLE = 'T';
    static int turtleX, turtleY;
    static int dx, dy;
    static boolean isPenDown;

    //Field Data
    final static int WIDTH = 20,
            HEIGHT = 20;
    final static char EMPTY_CELL = '.';
    final static char MARKED_CELL = '*';
    static char[][] field;

    //Turtle Methods
    public static void constructTurtle() {
        turtleX = turtleY = 0;
        dx = 1;
        dy = 0;
        isPenDown = false;
    }

    public static void putPenDown() {
        isPenDown = true;
    }

    public static void putPenUp() {
        isPenDown = false;
    }

    public static void turnLeft() {
        int t = dx;
        dx = dy;
        dy = t;

        dy = -dy;
    }

    public static void turnRight() {
        int t = dx;
        dx = dy;
        dy = t;

        dx = -dx;
    }

    public static void move(int steps) {
        for (int i = 0; i < steps; i++) {
            int nextX = turtleX + dx;
            int nextY = turtleY + dy;

            if (nextX < 0 || nextX >= WIDTH ||
                    nextY < 0 || nextY >= HEIGHT) {
                break;
            }
            if (isPenDown) {
                field[turtleY][turtleX] = MARKED_CELL;
            }

            turtleX = nextX;
            turtleY = nextY;
        }
    }


    //Field Methods
    public static void constructField() {
        field = new char[HEIGHT][WIDTH];
        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
                field[y][x] = EMPTY_CELL;
            }
        }
    }

    public static void printField() {
        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
                if (x == turtleX && y == turtleY) {
                    System.out.print(TURTLE);
                } else {
                    System.out.print(field[y][x]);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        constructField();
        constructTurtle();
        Scanner scan = new Scanner(System.in);
        boolean working = true;
        do {
            String line = scan.nextLine();
            String[] parts = line.split(" ");
            String command = parts[0].toLowerCase();
            switch (command) {
                case "penup":
                    putPenUp();
                    break;
                case "pendown":
                    putPenDown();
                    break;
                case "turnleft":
                    turnLeft();
                    break;
                case "turnright":
                    turnRight();
                    break;
                case "move":
                    if (parts.length > 1) {
                        int steps = Integer.parseInt(parts[1]);
                        move(steps);
                    } else {
                        System.err.println("The number of steps is not specified");
                    }
                    break;
                case "print":
                    printField();
                    break;
                case "exit":
                    working = false;
                    break;
                default:
                    System.err.println("Invalid command, please try again");
            }

        } while (working);

    }
}