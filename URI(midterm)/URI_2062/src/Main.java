import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        char word[];
        for (int i = 0; i < n; i++) {
            word = scan.next().toCharArray();
            if (word.length == 3) {
                if ((word[0] == 'O' || word[0] == 'U') && (word[1] == 'B' || word[1] == 'R')) {
                    word[2] = 'I';
                    if (i == n - 1) {
                        System.out.print(String.valueOf(word));
                    } else {
                        System.out.print(String.valueOf(word) + " ");
                    }
                } else {
                    if (i == n - 1) {
                        System.out.print(String.valueOf(word));
                    } else {
                        System.out.print(String.valueOf(word) + " ");
                    }
                }
            } else {
                if (i == n - 1) {
                    System.out.print(String.valueOf(word));
                } else {
                    System.out.print(String.valueOf(word) + " ");
                }
            }
        }
        System.out.println();
    }
}
