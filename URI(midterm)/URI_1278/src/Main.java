import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        boolean isFirst = true;
        while ((n = scan.nextInt()) != 0){
            if (isFirst){
                isFirst = false;
            } else {
                System.out.println();
            }

            String lineOfWords[] = new String[n];
            scan.nextLine();
            for (int i = 0; i < n; i++) {
                String words = scan.nextLine().trim();
                words = words.replaceAll("\\s+"," ");
                lineOfWords[i] = words;
            }

            String longest = lineOfWords[0];

            for (int i = 0; i < lineOfWords.length; i++) {
                if (lineOfWords[i].length() > longest.length()){
                    longest = lineOfWords[i];
                }
            }

            for (int i = 0; i < lineOfWords.length; i++) {
                int spaceNeed = longest.length() - lineOfWords[i].length();
                String updated = "";
                for (int j = 0; j < spaceNeed; j++) {
                    updated += " ";
                }
                updated += lineOfWords[i];
                lineOfWords[i] = updated;
                System.out.println(updated);
            }

        }
    }
}