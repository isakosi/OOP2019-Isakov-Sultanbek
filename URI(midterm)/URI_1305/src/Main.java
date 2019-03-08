import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            double a = scan.nextDouble();
            double b = scan.nextDouble();

            int sum = (int) ((a + 1) - b);
            System.out.println(sum);
        }
    }
}