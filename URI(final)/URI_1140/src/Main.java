import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] s;
        while (true) {
            s = scan.nextLine().toLowerCase().split("\\s+");
            if (s[0].equals("*")) {
                break;
            } else {
                boolean br = true;
                for (int i = 1; i < s.length; i++) {
                    if (s[i].charAt(0) != s[i - 1].charAt(0)) {
                        br = false;
                        break;
                    }
                }
                System.out.println(br ? "Y" : "N");
            }
        }
    }
}