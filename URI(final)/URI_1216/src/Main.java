import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int c = 0;
        int a = 0;
        while (scan.hasNext()) {
            String s = scan.nextLine();
            int b = scan.nextInt();
            c++;
            a += b;
        }
        double res = (float) a / c;
        System.out.printf("%.1f%n", res);
    }
}
