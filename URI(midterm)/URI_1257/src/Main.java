import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int alphaValue;
        int elemValue;
        int posValue;
        for (int i = 0; i < n; i++) {
            int line = scan.nextInt();
            char[] values = new char[line];
            for (int j = 0; j < line; j++) {
                char[] value = scan.next().toCharArray();
                values[j] = value[j];
            }
        }
    }
}
