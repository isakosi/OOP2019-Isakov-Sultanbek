import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char txt[] = scan.next().toCharArray();
        for (int i = txt.length; i > 0; i--) {

            for (char tx : txt) {
                System.out.print(tx + " ");
            }
            System.out.println();
        }
    }
}
