import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int sum = 285;
        String s = "";
        for(int k = 1; k <= x; k++) {
            int[][] arr = new int[9][9];
            for(int i = 0; i < 9; i++) {
                for(int j = 0; j < 9; j++) {
                    arr[i][j] = scanner.nextInt();
                }
            }
            int[] check1 = new int[9];
            int[] check2 = new int[9];
            int[][] small = new int[3][3];

            for(int i = 0; i < 9; i++) {
                check1[i] = check2[i] = small[i/3][i%3] = 0;
            }

            for(int i = 0;i < 9; i++) {
                for(int j = 0; j < 9; j++) {
                    int t = arr[i][j];
                    t *= t;
                    check1[i] += t;
                    check2[j] += t;
                    small[i/3][j/3] += t;

                    if( i == 8 && check2[j] != sum) {
                        break;
                    }
                }
                if(check1[i] != sum) {
                    break;
                }
            }
            if(s == "") {
                for(int i = 0; i < 3; i++) {
                    for(int j = 0; j < 3; j++) {
                        if(small[i][j] != sum)
                            s = "NAO";
                    }
                }
            }

            if(s == "") {
                s = "SIM";
            }
            System.out.println("Instancia " + k);
            System.out.println(s);
            System.out.println();
            s = "";
        }
    }

}