import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;
        int clon[] = new int[1000];
        while ((a = scan.nextInt()) != 0 && (b = scan.nextInt()) != 0) {
            int fake;
            int c = 0;
            for (int i = 0; i <= a; i++) {
                clon[i] = 0;
            }

            for (int i = 0; i < b; i++) {
                fake = scan.nextInt();

                if (clon[fake] == 1) {
                    c++;
                }
                clon[fake]++;
            }
            System.out.println(c);
        }
    }
}