import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        char l[][] = new char[2][];
        for (int i = 0; i < n; i++) {
            l[0] = scan.next().toCharArray();
            l[1] = scan.next().toCharArray();

            int l1Len = l[0].length;
            int l2Len = l[1].length;

            char[]word = new char[l1Len + l2Len];

            int bound = l1Len > l2Len ? l2Len : l1Len;

            for (int j = 0,k = 0; j < word.length && k < l1Len; j+=2,k++) {
                word[j] = l[0][k];

            }
            for (int j = 0,k = 0; j < word.length && k < l2Len; j++) {
                if (!Character.isLetter(word[j])){
                    word[j] = l[1][k];
                    k++;
                }
            }
            for (int j = bound * 2,k = bound; j < word.length; j++,k++) {
                word[j] = l1Len > l2Len ? l[0][k] : l[1][k];
            }
            System.out.println(word);
        }
    }
}
