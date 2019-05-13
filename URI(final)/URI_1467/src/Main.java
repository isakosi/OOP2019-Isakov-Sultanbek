import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt()) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();

            if (a == 0 && b == 0 & c == 0) {
                System.out.println("*");
            } else if (a == 0 && b == 0) {
                System.out.println("C");
            } else if (a == 1 && b == 1) {
                System.out.println("C");
            }
        }
    }
}
