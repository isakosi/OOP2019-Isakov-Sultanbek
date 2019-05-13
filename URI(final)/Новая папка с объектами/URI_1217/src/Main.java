import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int c = 0;
        float c1 = 0;
        for (int i = 1; i <= n; i++) {
            float a = scan.nextFloat();
            scan.nextLine();
            String[] s = scan.nextLine().split("\\s+");
            int num = s.length;
            System.out.printf("day %d: %d kg%n", i, num);
            c += num;
            c1 += a;
        }
        System.out.printf("%.2f kg by day%n", (float) c / n);
        System.out.printf("R$ %.2f by day%n", c1 / n);
    }
}
