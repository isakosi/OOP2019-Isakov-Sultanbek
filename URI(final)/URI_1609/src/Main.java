import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            Set<Integer> set = new HashSet<>();
            int sheep = scan.nextInt();
            for (int j = 0; j < sheep; j++) {
                int m = scan.nextInt();
                set.add(m);
            }
            System.out.println(set.size());
        }
    }
}
