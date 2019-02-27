import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();

            StringBuilder res = new StringBuilder();

            for (int j = num1, k = 0; j <= num2; j++, k++) {
                res.append(j);
            }
            System.out.print(res);
            System.out.println(res.reverse());
        }
    }
}