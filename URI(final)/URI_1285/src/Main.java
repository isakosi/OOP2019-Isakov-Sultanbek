import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numba = new int[4];
        while (scan.hasNextInt()) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int c = 0;

            for (int i = n; i <= m; i++) {
                int dig = 0;
                int fl = 0;
                int num = i;

                while (num != 0) {
                    numba[dig] = num % 10;
                    num /= 10;
                    dig++;
                }

                for (int j = 0; j < dig; j++) {
                    for (int k = j + 1; k < dig; k++) {
                        if (numba[j] == numba[k]) {
                            fl = 1;
                        }
                    }
                }
                if (fl == 0) {
                    c++;
                }
            }
            System.out.println(c);

        }
    }
}