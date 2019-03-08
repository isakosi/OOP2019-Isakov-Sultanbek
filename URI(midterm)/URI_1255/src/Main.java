import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < n; i++) {

            String s = scan.nextLine().trim().toLowerCase().replaceAll("\\s+", "");
            char[] letters = s.toCharArray();

            int max = 0;
            String res = "";

            for (char alhpa = 'a'; alhpa <= 'z'; alhpa++) {
                boolean oneLetter = true;
                int count = 0;

                for (int j = 0; j < letters.length; j++) {
                    if (letters[j] == alhpa) {
                        count++;
                        if (count > max) {
                            max = count;

                            if (oneLetter) {
                                res = Character.toString(alhpa);
                                oneLetter = false;
                            }
                        } else if (count == max) {
                            res += Character.toString(alhpa);
                        }
                    }
                }
            }
            System.out.println(res);
        }
    }
}