import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNextLine()) {
            String s = scan.nextLine();
            char sentence[] = s.toCharArray();

            for (int i = 0,j = 0; i < sentence.length; i++, j++) {
                char letter = s.charAt(i);
                if (Character.isLetter(letter)) {
                    sentence[i] = j % 2 == 0 ? Character.toUpperCase(letter) : Character.toLowerCase(letter);
                } else {
                    sentence [i] = letter;
                    j++;
                }
            }
            System.out.println(sentence);
        }
    }
}