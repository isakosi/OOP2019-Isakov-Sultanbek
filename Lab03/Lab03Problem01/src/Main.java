import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO:
        Scanner scan = new Scanner(System.in);
        System.out.println("Calculator of Rational numbers");
        do {
            System.out.print("Enter 1st rational (Ctrl-z: exit): ");
            if (!scan.hasNextLine()) break;
            Rational a;
            try {
                a = Rational.parse(scan.nextLine().trim());
            } catch (Exception e){
                System.err.println(e.getMessage());
                continue;
            }

            System.out.print("Enter operator: ");
            if (!scan.hasNextLine()) break;
            String operator = scan.nextLine().trim();


            System.out.print("Enter 2nd rational(Ctrl-z: exit): ");
            if (!scan.hasNextLine()) break;
            Rational b;
            try {
                b = Rational.parse(scan.nextLine().trim());
            } catch (Exception e){
                System.err.println(e.getMessage());
                continue;
            }

            String res = "";
            switch (operator) {
                case "+":
                    res = (a.add(b)).toString();

                    break;
                case "-":
                    res = (a.sub(b)).toString();

                    break;
                case "*":
                    res = (a.mult(b)).toString();
                    break;
                case "/":
                    res = (a.div(b)).toString();
                    break;
                case "<":
                    res = String.valueOf(a.compareTo(b) < 0);
                    break;
                case ">":
                    res = String.valueOf(a.compareTo(b) > 0);

                    break;
                case "=":
                    res = String.valueOf(a.compareTo(b) == 0);

                    break;
                case "!=":
                    res = String.valueOf(a.compareTo(b) != 0);

                    break;
                case ">=":
                    res = String.valueOf(a.compareTo(b) >= 0);
                    break;
                case "<=":
                    res = String.valueOf(a.compareTo(b) <= 0);
                    break;
                default:
                    System.err.println("Incorrect operator: " + operator);
            }
            System.out.printf("Result: %s %s %s = %s%n",a,operator,b,res);
        }
        while (true);

    }
}
