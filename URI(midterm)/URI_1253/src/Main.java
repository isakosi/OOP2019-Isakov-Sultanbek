import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        char [] word;
        int length;

        for (int i = 0; i < n ; i++) {
            word = scan.next().toCharArray();
            int move = scan.nextInt();
            length = word.length;
            for (int j = 0; j < length; j++) {
//                if (Character.isAlphabetic(word[j])) {
//                        word[j] = (char) ((int) word[j] - move);
//                        System.out.print(word[j]);
//                }
                int wordD = ((int) word[j] - move);
                if (wordD < 65){
                    wordD += 26;
                }
                word[j] = (char) wordD;
                System.out.print(word[j]);
            }
            System.out.println();
        }
    }
}