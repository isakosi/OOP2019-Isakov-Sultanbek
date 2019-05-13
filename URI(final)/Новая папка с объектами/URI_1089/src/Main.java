import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        while ((n = scan.nextInt()) != 0) {
            int musloop[] = new int[n + 2];
            for (int i = 0; i < n; i++) {
                musloop[i] = scan.nextInt();
            }

            musloop[n] = musloop[0];
            musloop[n + 1] = musloop[1];

            boolean dec = musloop[0] > musloop[1] ? true : false;

            int count = 0;
            for (int i = 1; i < musloop.length - 1; i++) {
                if (musloop[i] > musloop[i + 1]) {
                    if (!dec) {
                        count++;
                    }
                    dec = true;
                } else if (musloop[i] < musloop[i + 1]) {
                    if (dec) {
                        count++;
                    }
                    dec = false;
                }
            }
            System.out.println(count);
        }
    }
}