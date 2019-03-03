import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        while (scan.hasNextLine()) {

            up();
            bottom();
            space();

        }
    }

    private static void space() {
        System.out.println();
    }

    private static void up() {
        int testcases = scan.nextInt();
        String[] t = new String[testcases];
        for (int i = 0; i < t.length; i += 2) {
            for (int j = t.length; j > i; j--) {
                System.out.print(" ");

            }
            for (int k = -1; k < i; k++) {
                System.out.print(t[i] = "*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static void bottom() {

        String[] t = new String[3];
        for (int i = 0; i < t.length; i += 2) {
            for (int j = t.length; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = -1; k < i; k++) {
                System.out.print(t[i] = "*");
                System.out.print(" ");
            }
            System.out.println();

        }
    }

}