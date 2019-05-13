import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        while ((n = scan.nextInt()) != 0) {
            int m = 1;
            while (!check(m,n)) {
                m++;
            }
            System.out.println(m);
        }
    }
    static boolean check(int m, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        int c = 0;
        while (list.get(c) != 13) {
            list.remove(c);
            c = c + m - 1;
            if (c >= list.size()) {
                c = c % list.size();
            }
        }
        return list.size() == 1;

    }
}