import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            String d = scan.nextLine();
            String s = scan.nextLine();
            int lenghtD = d.length();
            int lenghtS = s.length();
            boolean sr = false;
            for (int i = 0; i < lenghtD; i++) {
                if (d.charAt(i) == s.charAt(0)) {
                    for (int j = 0; j < lenghtS; j++,i++) {
                        if (d.charAt(i) == s.charAt(j)) {
                            sr = true;
                        } else {
                            sr = false;
                            break;
                        }
                    }
                }
                if (sr){
                    break;
                }
            }
            System.out.println(sr ? "Resistente" : "Nao resistente");
        }
    }
}