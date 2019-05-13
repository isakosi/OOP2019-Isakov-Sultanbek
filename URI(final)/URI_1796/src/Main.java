import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        int ok = 0, notOk = 0;
        for (int i = 0; i < n; i++) {
            list.add(scan.nextInt());
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 1) {
                notOk++;
            } else if (list.get(i) == 0) {
                ok++;
            }
        }

        if (ok > notOk) {
            System.out.println("Y");
        } else if (notOk >= ok) {
            System.out.println("N");
        }
    }
}
