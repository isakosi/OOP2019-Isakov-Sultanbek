import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, m;
        while ((n = scan.nextInt()) != 0 && (m = scan.nextInt()) != 0) {
            scan.nextLine();
            int mat[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    mat[i][j] = scan.nextInt();
                }
            }
        }
    }
}
