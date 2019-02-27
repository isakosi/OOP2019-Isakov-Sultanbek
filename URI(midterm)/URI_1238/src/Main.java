import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        char l[][] = new char[2][];
        String s1,s2;
        for (int i = 0; i < n; i++) {
            s1 = scan.next();
            s2 = scan.next();
            l[0] = s1.toCharArray();
            l[1] = s2.toCharArray();
            char[] word = new char[l[0].length + l[1].length];

            int bound = l[0].length > l[1].length ? l[1].length : l[0].length;

            for (int j = 0,k = 0; k < l[0].length && j < word.length;j += 2, k++) {
                word[j] = l[0][k];
            }
            for (int j = 0, k = 0; j < word.length && k < l[1].length; j++) {
                if (!Character.isLetter(word[j])){
                    word[j] = l[1][k];
                    k++;
                }
            }
            for (int j = bound * 2,k = bound; j < word.length; j++, k++) {
                word[j] = l[0].length > l[1].length ? l[0][k] : l[1][k];
            }
            System.out.println(word);
        }
    }
}