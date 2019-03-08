import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNextInt()) {
            int n = scan.nextInt();
            int bottom = 2;
            //Top
            for (int i = 0; i <= n; i += 2) {
                for (int j = n; j > i; j -= 2) {
                    if (j == n) {
                        System.out.print("");
                    } else {
                        System.out.print(" ");
                    }
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            //Bottom
            for (int i = 0; i <= bottom; i += 2) {

                for (int j = n; j > i; j -= 2) {
                    if (j == n) {
                        System.out.print("");
                    } else {
                        System.out.print(" ");
                    }
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}