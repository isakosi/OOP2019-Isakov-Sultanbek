import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int M,N;
        String c;
        while (scan.hasNextLine()){
            M = scan.nextInt();
            N = scan.nextInt();
            if (M == 0 && N == 0){
                break;
            }
            c = Integer.toString(M + N);
            c = c.replace("0","");
            System.out.println(c);
        }
    }
}
