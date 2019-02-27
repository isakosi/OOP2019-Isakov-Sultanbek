public class CustomMath {

    //GCD 1
    public static int gcd(int a, int b) {
        if (a == 0 && b == 0) {
            System.out.println("GCD(0, 0) is not defined");
        } else if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        }
        int d = Math.min(a, b);
        while (a % d != 0 || b % d != 0) {
            --d;
        }
        return d;
    }
    private CustomMath(){

    }
    //GCD 2
    static int gcd2(int a, int b) {
        return b == 0 ? a : gcd2(b, a % b);
    }
}