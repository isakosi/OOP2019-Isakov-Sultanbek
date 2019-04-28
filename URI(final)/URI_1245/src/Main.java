import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNextInt()) {

            int n = scan.nextInt();
            ArrayList<Integer> sizes = new ArrayList();
            ArrayList<String> sides = new ArrayList();
            int count = 0;

            for (int i = 0; i < n; i++) {
                int size = scan.nextInt();
                String side = scan.next();

                if (sizes.contains(size)) {
                    int index = sizes.indexOf(size);
                    if (!sides.get(index).equals(side)) {
                        count++;
                        sizes.remove(index);
                        sides.remove(index);
                    } else {
                        sizes.add(size);
                        sides.add(side);
                    }
                } else {
                    sizes.add(size);
                    sides.add(side);
                }
            }

            System.out.println(count);
        }
    }
}