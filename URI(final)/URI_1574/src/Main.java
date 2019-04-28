import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int c = 0;
            int m = scan.nextInt();
            int []co = new int[m + 1];
            scan.nextLine();
            for (int j = 1; j <= m; j++) {
                String com = scan.nextLine();
                if (com.equals("RIGHT")) {
                    c++;
                    co[j] = 1;
                } else if (com.equals("LEFT")) {
                    c--;
                    co[j] = -1;
                } else {
                    int t = Integer.parseInt(com.substring(8));
                    c += co[t];
                    co[j] = co[t];
                }
            }
            System.out.println(c);
        }
    }
}