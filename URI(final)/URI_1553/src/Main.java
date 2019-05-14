import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, freq;
        while ((n = scan.nextInt()) != 0 && (freq = scan.nextInt()) != 0) {
            int nums[] = new int[1000];
            int c = 0;
            for (int i = 0; i < n; i++) {
                int quest = scan.nextInt();
                nums[quest]++;
            }

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] >= freq) {
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}