import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            int num = scan.nextInt();
            list.add(num);
        }
        Collections.sort(list);
        int similar = list.get(0);
        int i = 0;
        int c = 0;
        while (true) {
            if (i == n) {
                System.out.printf("%d aparece %d vez(es)%n", similar, c);
                break;
            } else if (similar == list.get(i)) {
                c++;
                i++;
            }else{
                System.out.printf("%d aparece %d vez(es)%n", similar, c);
                similar = list.get(i);
                c = 0;
            }
        }
    }
}