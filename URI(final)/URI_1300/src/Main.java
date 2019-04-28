import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt()) {
            int n = scan.nextInt();
            boolean check;
            if (n % 6 != 0) {
                check = false;
            } else {
                check = true;
            }

            System.out.println(check ? "Y" : "N");
        }
    }
}