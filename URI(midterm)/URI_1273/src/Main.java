//import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean isFirst = true;
        int n;
        while ((n = scan.nextInt()) != 0){
            // for adding spaces between cases
            if (isFirst) {
                isFirst = false;
            } else {
                System.out.println();
            }

            // reading input and adding to array
            String[]  words = new String[n];
            for (int i = 0; i < n; i++) {
                String word = scan.next();
                words[i] = word;
            }

            String longest = words[0];

            for (int i = 0; i < words.length; i++) {
                if (words[i].length() > longest.length()){
                    longest = words[i];
                }
            }
            for (int i = 0; i < words.length; i++) {
                int spaceNeed = longest.length() - words[i].length();
                String updatedW = "";
                for (int s = 0; s < spaceNeed; ++s) {
                    updatedW += " ";
                }
                updatedW += words[i];
                words[i] = updatedW;
                System.out.println(updatedW);
            }
        }
    }
}