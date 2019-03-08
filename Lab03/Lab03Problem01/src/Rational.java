public class Rational {
    // State
    private int numerator;
    private int denominator;


    //Behaviour
    Rational(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Incorrect rational: Denominator can't be zero");
        }
        this.numerator = numerator;
        this.denominator = denominator;

        int gcd = CustomMath.gcd2(numerator,denominator);
        this.numerator /= gcd;
        this.denominator /= gcd;
        //TODO: simplify (gcd)
    }

    //Parse
    static Rational parse(String s) {
        String[] parts = s.split("/");
        if (parts.length == 0 || parts.length > 2){
            throw new IllegalArgumentException("Incorrect rational:  " + s);
        }
        try {
            if (parts.length == 1) {
                return new Rational(Integer.parseInt(parts[0]), 1);
            } else {
                return new Rational(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]));
            }
        }catch (NumberFormatException e){
            throw new NumberFormatException("Incorrect rational: " + s);
        }

//        int index = s.indexOf('/');
//        if (index == -1) {
//            int tnum = Integer.parseInt(s);
//            return new Rational(tnum, 1);
//        }
//        int tnum = Integer.parseInt(s.substring(0, index));
//        int tden = Integer.parseInt(s.substring(index + 1));
//        return new Rational(tnum, tden);
    }


    // Compare Rationals
    public int compareTo(Rational other) {
        int a = numerator * other.denominator;
        int b = denominator * other.numerator;

        return a - b;
    }

    //toString
    public String toString() {
        return numerator + "/" + denominator;
    }


    Rational add(Rational other) {
        int resN = numerator * other.denominator + denominator * other.numerator;
        int resD = denominator * other.denominator;
        Rational result = new Rational(resN, resD);

        return result;
    }

    Rational sub(Rational other) {

        int resN = numerator * other.denominator - denominator * other.numerator;
        int resD = denominator * other.denominator;
        Rational result = new Rational(resN, resD);

        return result;
    }

    Rational mult(Rational other) {

        int resN = numerator * other.numerator;
        int resD = denominator * other.denominator;
        Rational result = new Rational(resN, resD);

        return result;
    }

    Rational div(Rational other) {

        int resN = numerator * other.denominator;
        int resD = denominator * other.numerator;
        Rational result = new Rational(resN, resD);

        return result;
    }
}