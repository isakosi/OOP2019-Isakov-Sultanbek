import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int c = 0;
        boolean br = false;
        ArrayList <String> list = new ArrayList<String>();
        String pok;
        for (int i = 0; i < n; i++) {
            pok = scan.next();
            list.add(pok);
        }

        for (int i = 0; i < list.size(); i++) {
            String po = list.get(i);
            for (int j = 0; j < list.size(); j++) {

            }

        }

        int res = 151 - c;
        System.out.printf("Falta(m) %d pomekon(s).%n", res);
    }
}