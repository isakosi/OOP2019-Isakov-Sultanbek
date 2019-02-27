import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(scan.readLine());
        for (int i = 0; i < n; i++) {
            String s = scan.readLine();
            int lenght = s.length();
            int halflenght = lenght / 2;

            String half1 = s.substring(0, halflenght);
            String half2 = s.substring(halflenght,lenght);

            for (int j = half1.length() - 1; j >= 0 ; j--) {
                System.out.print(half1.charAt(j));
            }
            for (int j = half2.length() - 1; j >= 0 ; j--) {
                System.out.print(half2.charAt(j));
            }
            System.out.println();
        }
    }
}
