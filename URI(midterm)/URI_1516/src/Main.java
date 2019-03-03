import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        for (int i = 0; i < n; i++) {
            String[] s = new String[m];
            for (int j = 0; j < s.length; j++) {
                s[j] = scan.next();
            }
        }
        int a = scan.nextInt();
        int b = scan.nextInt();

    }
}
