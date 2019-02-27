import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            boolean check = false;
            String t = "", lang = "";
            int people = scan.nextInt();
            for (int j = 0; j < people; j++) {
                lang = scan.next().trim();

                if (j == 0){
                    t = lang;
                }
                if (!t.equals(lang)){
                    check = true;
                }
            }
            if (check){
                System.out.println("ingles");
            } else {
                System.out.println(lang);
            }
        }
    }
}
