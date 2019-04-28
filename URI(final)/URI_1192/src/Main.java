import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int res = 0;
            char[] s = scan.next().toCharArray();
            int a = Integer.parseInt(String.valueOf(s[0]));
            char c = s[1];
            int b = Integer.parseInt(String.valueOf(s[2]));
            if (a == b) {
                res = a * b;
            } else if (Character.isLowerCase(c)) {
                res = b + a;
            } else if (Character.isUpperCase(c)) {
                res = b - a;
            }
            System.out.println(res);
        }
    }
}
