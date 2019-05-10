import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;
        while ((a = scan.nextInt()) != 0 && (b = scan.nextInt()) != 0) {
            Set<Integer> c1 = new HashSet<>();
            Set<Integer> c2 = new HashSet<>();
            int count = 0;
            int count2 = 0;
            for (int i = 0; i < a; i++) {
                c1.add(scan.nextInt());
            }

            for (int i = 0; i < b; i++) {
                c2.add(scan.nextInt());
            }

            for (Integer el: c1) {
                if (!c2.contains(el)) {
                    count++;
                }
            }

            for (Integer el: c2) {
                if (!c1.contains(el)) {
                    count2++;
                }
            }

            System.out.println(count < count2 ? count : count2);
        }
    }
}