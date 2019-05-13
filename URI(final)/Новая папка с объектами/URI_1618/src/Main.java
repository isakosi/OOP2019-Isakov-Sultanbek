import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int j = 0; j < n; j++) {
            int[] a = new int[10];

            for (int i = 0; i < 10; i++) {
                a[i] = scan.nextInt();
            }
            if ((a[8] >= a[0] && a[8] <= a[2]) && a[9] >= a[1] && a[9] <= a[7]) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}
