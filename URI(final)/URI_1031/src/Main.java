import java.util.Scanner;

public class Main {
    static int remain(int n, int k) {
        int r = 0;
        for (int i = 1; i < n; i++) {
            r = (r + k) % i;
        }
        return r;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        while ((n = scan.nextInt()) != 0) {
            int k = 1;

            for (int i = 0; i < n; i++) {
                if (remain(n, k) != 11) {
                    k++;
                } else {
                    break;
                }
            }

            System.out.println(k);
        }
    }
}