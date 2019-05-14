import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        while (true) {
            int mary = 0, john = 0;
            n = scan.nextInt();
            if (n != 0) {
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    list.add(scan.nextInt());
                }

                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i) == 0) {
                        mary++;
                    } else if (list.get(i) == 1) {
                        john++;
                    }
                }

                System.out.printf("Mary won %d times and John won %d times%n", mary, john);
            } else {
                break;
            }
        }
    }
}
