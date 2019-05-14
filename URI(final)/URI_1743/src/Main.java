import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] s1 = scan.nextLine().split("\\s+");
        String[] s2 = scan.nextLine().split("\\s+");
        boolean check = true;
        for (int i = 0; i < s1.length; i++) {
            if ((s1[i].equals(s2[i]))) {
                check = false;
                break;
            }
        }
        System.out.println(check ? "Y" : "N");
    }
}
