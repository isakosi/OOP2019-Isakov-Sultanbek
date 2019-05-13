import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt()) {
            int n = scan.nextInt();
            int i = 0;
            int j = (int) Math.sqrt(n);
            int s;
            boolean check = false;
            while (j >= i) {
                s = (int) (Math.pow(i, 2) + Math.pow(j, 2));

                if (s == n) {
                    check = true;
                    break;
                } else if (s < n) {
                    i++;
                } else {
                    j--;
                }
            }
            System.out.println(check ? "YES" : "NO");
        }
    }
}