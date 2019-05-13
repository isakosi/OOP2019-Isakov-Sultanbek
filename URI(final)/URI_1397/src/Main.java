import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        while ((n = scan.nextInt()) != 0) {
            int aCount = 0, bCount = 0;
            for (int i = 0; i < n; i++) {
                int a = scan.nextInt();
                int b = scan.nextInt();
                if (a > b) {
                    aCount++;
                } else if (b > a) {
                    bCount++;
                }
            }
            System.out.printf("%d %d%n", aCount, bCount);
        }
    }
}