import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        char st = '*';
        for (int i = 0; i < n-2; i++) {
            System.out.print(st);
            for (int j = 0; j < i; j++) {
                System.out.print(st);
            }
            System.out.println();

        }
    }
}
