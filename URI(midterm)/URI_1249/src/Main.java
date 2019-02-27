import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            char word[] = scan.nextLine().toCharArray();
            int lenght = word.length;
            for (int i = 0; i < lenght; i++) {
                char wordD = word[i];
                if (wordD >= 'a' && wordD <= 'm') {
                    wordD += 13;
                } else if (wordD >= 'A' && wordD <= 'M') {
                    wordD += 13;
                } else if (wordD >= 'n' && wordD <= 'z') {
                    wordD -= 13;
                } else if (wordD >= 'N' && wordD <= 'Z') {
                    wordD -= 13;
                }
                System.out.print(wordD);
            }
            System.out.println();
        }
    }
}