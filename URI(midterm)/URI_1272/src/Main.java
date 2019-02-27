import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            String txt = scan.next();

            StringBuilder res = new StringBuilder();

            txt = txt.replace("·"," ");

            String[] words = txt.trim().split("\\s+");
            for (String word : words){
                if (word.length() > 0){
                    res.append(word.charAt(0));
                } else {
                    System.out.println("");
                }
            }
            System.out.println(res);
        }
    }
}