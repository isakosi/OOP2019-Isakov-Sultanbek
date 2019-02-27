import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        Field field = new Field();

        Scanner scan = new Scanner(System.in);
        boolean working = true;
        do {
            String line = scan.nextLine();
            String[] parts = line.split(" ");
            String command = parts[0].toLowerCase();
            switch (command) {
                case "penup":
                    turtle.putPenUp();
                    break;
                case "pendown":
                    turtle.putPenDown();
                    break;
                case "turnleft":
                    turtle.turnLeft();
                    break;
                case "turnright":
                    turtle.turnRight();
                    break;
                case "move":
                    if (parts.length > 1) {
                        int steps = Integer.parseInt(parts[1]);
                        turtle.move(steps, field);
                    } else {
                        System.err.println("The number of steps is not specified");
                    }
                    break;
                case "print":
                    field.print(turtle);
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