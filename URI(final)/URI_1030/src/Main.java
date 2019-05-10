import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int num[] = new int[a];
            int index = -1;

            for (int j = 0; j < a - 1; j++) {
                for (int k = 0; k < b; ) {
                    index++;
                    if (index == a) {
                        index = 0;
                    }
                    if (num[index] == 0) {
                        k++;
                    }
                }
                num[index] = 1;
            }

            for (int k = 0; k < a; k++) {
                if (num[k] == 0) {
                    System.out.printf("Case %d: %d%n", i + 1, k + 1);
                    break;
                }
            }
        }
    }
}