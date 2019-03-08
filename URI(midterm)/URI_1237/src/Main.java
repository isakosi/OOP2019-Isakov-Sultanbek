import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            String a = scan.nextLine();
            String b = scan.nextLine();
            int c = 0;

            for (int i = 0; i < a.length() - 1; i++) {
                for (int j = 0; j < b.length() - 1; j++) {
                    if (a.charAt(i) == b.charAt(j)) {
                        if (a.substring(i,i+1) == b.substring(j,j+1)) {
                            c++;
                        } else {
                            c++;
                        }
                    }
                }
            }
            System.out.println(c);
        }
    }
}