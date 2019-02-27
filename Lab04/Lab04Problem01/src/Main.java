import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList<Integer>();
        while (scan.hasNextInt()){
            list.add(scan.nextInt());
        }

        Integer[] nums = new Integer[list.size()];
        nums = list.toArray(nums);

        System.out.println("Before reversing:");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();

        System.out.println("After reversing:");
        for (int i = nums.length - 1; i >= 0 ; i--) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}