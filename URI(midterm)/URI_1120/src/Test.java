import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String l;
        while (!(l = scan.nextLine()).equals("0 0")){
            String[]nums = l.split("\\s");

            String num1 = nums[0];
            String num2 = nums[1];

            String res = num2.replace(num1,"");
            res = res.replaceFirst("0*","");
            System.out.println(res.length() > 0 ? res : 0);
        }
    }
}
