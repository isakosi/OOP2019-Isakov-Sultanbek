import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            String a = scan.next();
            String b = scan.next();
            char[][]word = new char[2][];
            word[0] = a.toCharArray();
            word[1] = b.toCharArray();
            int c = 0;
            for (int j = 0; j < a.length(); j++) {
                if (word[0][j] != word[1][j]){
                    do {
                        word[0][j]++;
                        if (word[0][j] > 'z'){
                            word[0][j] = 'a';
                        }
                        c++;
                    } while (word[0][j] != word[1][j]);
                }
            }
            System.out.println(c);
        }
    }
}
