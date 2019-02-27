import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(scan.readLine());
        char[] M;
        for (int i = 0; i < num; i++) {
            M = scan.readLine().toCharArray();
            int lenght = M.length;
            int half = lenght / 2;
            for (int j = 0; j < lenght; j++) {
                if (Character.isLetter(M[j])) {
                    M[j] = (char) ((int) M[j] + 3);
                }
            }
            for (int j = 0; j < half; j++) {
                char t = M[j];
                M[j] = M[lenght - j - 1];
                M[lenght - j - 1] = t;

            }
            for (int j = (half); j < lenght ; j++) {
                M[j] = (char) ((int) M[j] - 1);
            }
            System.out.println(M);
        }
    }
}