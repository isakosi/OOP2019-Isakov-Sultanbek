import java.util.Scanner;

public class ex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        char[]m;
        for (int i = 0; i < n; i++) {
            m = scan.next().toCharArray();
            int lenght = m.length;
            int half = lenght/2;

            for (int j = 0; j < lenght; j++) {
                if (Character.isLetter(m[j])){
                    m[j] = (char) (m[j] + 3);
                }
            }
            System.out.println(m);
            for (int j = 0; j < half; j++) {
                char t = m[j];
                m[j] = m[lenght - j - 1];
                m[lenght - j - 1] =  t;
            }
            System.out.println(m);
            for (int j = (half); j < lenght; j++) {
                m[j] = (char) (m[j] - 1);
            }
            System.out.println(m);
            for (char ms : m){
                System.out.print(ms);
            }
            System.out.println();
        }
    }
}
