import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int it = 0;
        int b = 0;
        while (scan.hasNextLine()) {
            StringBuilder s = new StringBuilder();
            String txt = scan.nextLine();
            for (int i = 0; i < txt.length(); i++) {
                if (txt.charAt(i) == '_') {
                    if (it == 0) {
                        s.append("<i>");
                        it = 1;
                    } else {
                        s.append("</i>");
                        it = 0;
                    }
                } else if (txt.charAt(i) == '*') {
                    if (b == 0) {
                        s.append("<b>");
                        b = 1;
                    } else {
                        s.append("</b>");
                        b = 0;
                    }
                } else {
                    s.append(txt.charAt(i));
                }
            }
            System.out.println(s);
        }
    }
}