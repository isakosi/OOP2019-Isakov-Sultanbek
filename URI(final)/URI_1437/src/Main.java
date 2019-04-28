import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        while ((n = scan.nextInt()) != 0) {
            scan.nextLine();
            String s = scan.nextLine();
            int c = 1;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'D') {
                    c++;
                    if (c > 4) {
                        c = 1;
                    }
                } else if (s.charAt(i) == 'E') {
                    c--;
                    if (c == 0) {
                        c = 4;
                    }
                }
            }
            if (c == 1) {
                System.out.println("N");
            } else if (c == 2) {
                System.out.println("L");
            } else if (c == 3) {
                System.out.println("S");
            } else if (c == 4) {
                System.out.println("O");
            }
        }
    }
}