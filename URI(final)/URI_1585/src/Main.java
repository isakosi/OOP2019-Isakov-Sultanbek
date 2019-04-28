import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int res = a * b;
            System.out.printf("%d cm2%n",res / 2);
        }
    }
}
