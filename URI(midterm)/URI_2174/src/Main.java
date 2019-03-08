import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Set <String> list = new HashSet <String>();
        for (int i = 0; i < n; i++) {
            String pok = scan.next();
            list.add(pok);
        }
        int res = 151 - list.size();

        System.out.printf("Falta(m) %d pomekon(s).%n",res);
    }
}