import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        while ((n = scan.nextInt()) != 0) {
            for (int i = 0; i < n; i++) {
                int te = 0;
                int a = scan.nextInt();
                int b = scan.nextInt();
                int c = scan.nextInt();
                int d = scan.nextInt();
                int e = scan.nextInt();

                if (a <= 127) {
                    te++;
                    a = 1;
                } else {
                    a = 0;
                }
                if (b <= 127) {
                    te++;
                    b = 1;
                } else {
                    b = 0;
                }
                if (c <= 127) {
                    te++;
                    c = 1;
                } else {
                    c = 0;
                }
                if (d <= 127) {
                    te++;
                    d = 1;
                } else {
                    d = 0;
                }
                if (e <= 127) {
                    te++;
                    e = 1;
                } else {
                    e = 0;
                }

                if (te == 1) {
                    if (a == 1) {
                        System.out.println("A");
                    }
                    if (b == 1) {
                        System.out.println("B");
                    }
                    if (c == 1) {
                        System.out.println("C");
                    }
                    if (d == 1) {
                        System.out.println("D");
                    }
                    if (e == 1) {
                        System.out.println("E");
                    }

                } else {
                    System.out.println("*");
                }

            }
        }
    }
}
