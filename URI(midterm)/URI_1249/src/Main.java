import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            char word[] = scan.nextLine().toCharArray();
            int lenght = word.length;
            for (int i = 0; i < lenght; i++) {
                char letter = word[i];
                if (letter >= 'a' && letter <= 'm') {
                    letter += 13;
                } else if (letter >= 'A' && letter <= 'M') {
                    letter += 13;
                } else if (letter >= 'n' && letter <= 'z') {
                    letter -= 13;
                } else if (letter >= 'N' && letter <= 'Z') {
                    letter -= 13;
                }
                System.out.print(letter);
            }
            System.out.println();
        }
    }
}