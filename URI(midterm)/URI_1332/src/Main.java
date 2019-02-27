import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            char numWord[] = scan.next().toCharArray();
            if (numWord.length == 3) {
                if (numWord[0] == 't' && numWord[2] == 'o' || numWord[1] == 'w' && numWord[2] == 'o' ||
                        numWord[0] == 't' && numWord[1] == 'w') {
                    System.out.println(2);
                } else {
                    System.out.println(1);
                }
            } else {
                System.out.println(3);
            }
        }
    }
}

