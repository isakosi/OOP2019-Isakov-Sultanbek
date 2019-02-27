import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lowCase = 0;
        int upCase = 0;
        int nums = 0;
        while (scan.hasNext()){
            String tx = scan.nextLine();
            int length = tx.length();
            if (length < 6 || length > 32){
                invalid();
            } else {
                for (int i = 0; i < length; i++) {
                    if (tx.charAt(i) >= 'a' && tx.charAt(i) <= 'z'){
                        lowCase++;
                    }
                    if (tx.charAt(i) >= 'A' && tx.charAt(i) <= 'Z'){
                        upCase++;
                    }
                    if (tx.charAt(i) >= '0' && tx.charAt(i) <= '9'){
                        nums++;
                    }
                }
                if (lowCase == 0){
                    invalid();
                } else if (upCase == 0){
                    invalid();
                } else if (nums == 0){
                    invalid();
                } else if (lowCase + upCase + nums == length){
                    valid();
                } else {
                    invalid();
                }
            }
            lowCase = 0;
            upCase = 0;
            nums = 0;
        }
        scan.close();
    }
    public static  void invalid(){
        System.out.println("Senha invalida.");
    }
    public static void  valid(){
        System.out.println("Senha valida.");
    }
}