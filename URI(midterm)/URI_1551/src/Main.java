import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < n; i++) {
            String s = scan.nextLine().trim().replaceAll("\\s+", "");
            char[] sent = s.toCharArray();

            int c = 0;

            for (char alph = 'a'; alph <= 'z'; alph++) {
                boolean isFirst = true;
                for (int j = 0; j < sent.length; j++) {
                    if (isFirst) {
                        if (alph == sent[j]) {
                            c++;
                            isFirst = false;
                        }
                    }
                }
            }
            if (c == 26) {
                System.out.println("frase completa");
            } else if (c >= 13 && c < 26) {
                System.out.println("frase quase completa");
            } else if (c < 13) {
                System.out.println("frase mal elaborada");
            }
        }
    }
}
