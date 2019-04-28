import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int c = 1;
        while (scan.hasNext()) {
            String s = scan.nextLine();
            String m = scan.nextLine();

            int male = 0;
            int fem = 0;
            int qua = 0;
            int a = 3;
            for (int i = 0; i < m.length(); i += 5) {
                if (s.charAt(0) == m.charAt(i) && s.charAt(1) == m.charAt(i + 1)) {
                    qua++;
                    if (m.charAt(a) == 'F') {
                        fem++;
                    } else if (m.charAt(a) == 'M') {
                        male++;
                    }
                }
                a += 5;
            }
            if (c != 1) {
                System.out.println();
            }
            System.out.printf("Caso %d:%n", c);
            System.out.printf("Pares Iguais: %d%n", qua);
            System.out.printf("F: %d%n", fem);
            System.out.printf("M: %d%n", male);
            c++;
        }
    }
}