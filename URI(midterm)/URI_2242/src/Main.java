import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] s = scan.next().toCharArray();

        List <Character> list = new ArrayList <Character>();
        for (int i = 0; i < s.length; i++) {
            char glas = s[i];
            if (s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u') {
                list.add(glas);
            }
        }
        boolean isPalindrome = true;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) != list.get(list.size() - 1 - i)){
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome ? "S" : "N");
    }
}