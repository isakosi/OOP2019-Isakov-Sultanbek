import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()){
            String a = scan.nextLine();
            String b = scan.nextLine();
            int c = 0;
            int lenghtA = a.length();
            int lenghtB = b.length();

            for (int i = 0; i < a.length(); i++) {
                for (int j = 0; j < b.length(); j++) {
                    if (a.charAt(i) == b.charAt(j)){
                        c++;
                    }
                }
            }
            System.out.println(c);
        }
    }
}