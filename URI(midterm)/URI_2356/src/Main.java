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
            for (int i = 0, j = lenghtS; j <= lenghtD; i++,j++) {
                if (d.substring(i,j).equalsIgnoreCase(s)){
                    sr = true;
                    break;
                }
            }
            System.out.println(sr ? "Resistente" : "Nao resistente");
        }
    }
}