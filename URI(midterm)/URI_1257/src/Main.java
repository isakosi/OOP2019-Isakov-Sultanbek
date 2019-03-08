import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int lines = scan.nextInt();
            scan.nextLine();
            char[][] letters = new char[lines][];
            for (int j = 0; j < letters.length; j++) {
                String s = scan.next();
                letters[j] = s.toCharArray();
            }

            int hash = 0;
            for (int j = 0; j < letters.length; j++) {
                for (int k = 0; k < letters[j].length; k++) {

                    int alphPos = letters[j][k] - 65;

                    hash += j + k + alphPos;
                }
            }
            System.out.println(hash);
        }
    }
}
