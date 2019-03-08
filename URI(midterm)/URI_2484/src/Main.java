import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            String txt = scan.nextLine();
            int lenght = txt.length();

            for (int i = lenght - 1; i >= 0; i--) {

                for (int j = lenght - i; j > 1; j--) {
                    System.out.print(" ");
                }

                for (int j = 0; j <= i; j++) {
                    if (j == i) {
                        System.out.print(txt.charAt(j));
                    } else {
                        System.out.print(txt.charAt(j) + " ");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}