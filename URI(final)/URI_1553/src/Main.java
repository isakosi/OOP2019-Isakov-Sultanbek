import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, k;
        while ((n = scan.nextInt()) != 0 && (k = scan.nextInt()) != 0) {
            int c = 0;
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(scan.nextInt());
            }
            Collections.sort(list);
            int dig = 0;
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i - 1) == list.get(i)) {
                    dig = list.get(i);
                }
            }

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == dig) {
                    c++;
                }
            }
            Set<Integer> set = new HashSet<>();

            if (k == 1) {
                for (int i = 0; i < list.size(); i++) {
                    set.add(list.get(i));
                }

                System.out.println(set.size());
            } else {
                System.out.println(list);
                System.out.println(c);
            }
        }
    }
}