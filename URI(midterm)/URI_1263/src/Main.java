import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()){
            String sent = scan.nextLine().toLowerCase();
            String word[] = sent.split(" ");

            int c = 0;
            boolean isFirst = true;
            for (int i = 1; i < word.length; i++) {
                if (isFirst){
                    if (word[i].charAt(0) == word[i - 1].charAt(0)){
                        c++;
                        isFirst = false;
                    }
                } else {
                    if (word[i].charAt(0) == word[i - 1].charAt(0) && word[i].charAt(0) != word[i - 2].charAt(0)){
                        c++;
                    }
                }
            }
            System.out.println(c);
        }
    }
}
