import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n ;
        while ((n = scan.nextInt()) != 0) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(scan.nextInt());
            }

            int sus = 0;
            ArrayList<Integer> list1 = (ArrayList<Integer>) list.clone();
            Collections.sort(list1);
            for (int i = 1; i < list1.size(); i++) {
                sus = list1.get(i - 1);
            }
            int susp = 0;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == sus) {
                    susp = list.indexOf(list.get(i));
                }
            }
            susp++;
            System.out.println(susp);
        }
    }
}
