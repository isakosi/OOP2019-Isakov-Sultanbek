import java.util.Scanner;

public class Main {

    static final String QWERTY = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";
    static final char[] KEY = QWERTY.toCharArray();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s;
        char[] in;
        int index;
        while (scan.hasNextLine()) {
            s = scan.nextLine();
            in = s.toCharArray();
            for (char letter : in) {
                index = QWERTY.indexOf(letter);
                System.out.print(index != -1 ? KEY[index - 1] : letter);
            }
            System.out.println();
        }
    }
}
