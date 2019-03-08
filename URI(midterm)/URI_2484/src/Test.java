import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String tx = scan.next();
        int lenght = tx.length();
        for (int i = 0; i < lenght; i++) {

            for (int j = lenght - i; j > 1; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(tx.charAt(j)+" ");
            }

            System.out.println();
        }
    }
}
