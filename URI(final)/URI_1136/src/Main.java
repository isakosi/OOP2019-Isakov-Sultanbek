import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            int b = scanner.nextInt();
            if (n==0 && b==0) break;
            String result = "Y";
            boolean[] n1 = new boolean[n+1];
            int[] b1 = new int[b];
            for (int i = 0; i<b; i++) {
                b1[i]=scanner.nextInt();
            }
            for (int i = 0; i<b; i++) {
                for (int j = 0; j<b;j++) {
                    if (j!=i) {
                        n1[Math.abs(b1[i]-b1[j])]=true;
                    }
                }
            }
            for (int i = 1; i<n+1; i++) {
                if (n1[i]==false) {
                    result="N";
                    break;
                }
            }
            System.out.println(result);
        }
    }
}