import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;
        while ((a = scan.nextInt()) != 0 && (b = scan.nextInt()) != 0) {
            int count = 0;
            int[] scu = new int[b];
            for (int i = 0; i < b; i++) {
                scu[i] = scan.nextInt();
                if (i != 0) {
                    if (scu[i - 1] > scu[i]) {
                        count += scu[i - 1] - scu[i];
                    }
                } else {
                    count += a - scu[i];
                }
            }
            System.out.println(count);
        }
    }
}