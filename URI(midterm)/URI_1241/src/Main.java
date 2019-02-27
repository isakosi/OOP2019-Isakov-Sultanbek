import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            String numWord1 = scan.next();
            String nummWord2 = scan.next();

            int length1 = numWord1.length();
            int length2 = nummWord2.length();
            if (length1 < length2){
                System.out.println("nao encaixa");
            } else {
                System.out.println(numWord1.substring(length1 - length2, length1).equals(nummWord2) ?
                        "encaixa" : "nao encaixa");
            }
        }
    }
}
