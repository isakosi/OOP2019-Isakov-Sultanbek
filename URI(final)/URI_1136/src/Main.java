import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b;
        while ((a = scan.nextInt()) != 0 && (b = scan.nextInt()) != 0) {
            boolean check = false;
            for (int i = 0; i < b; i++) {
                int m = scan.nextInt();
                if (m == a) {
                    check = true;
                }
            }
            System.out.println(check ? "Y" : "N");
        }
    }
}
