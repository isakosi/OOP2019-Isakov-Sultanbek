import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        while (scan.hasNextInt()) {
            numbers.add(scan.nextInt());
        }


        System.out.println("Before reversing:");
        print(numbers);

        System.out.println("After reversing:");
        reverse(numbers);
        print(numbers);
        zeroBeforeEven(numbers);
        System.out.println("After insertions: ");
        print(numbers);

        removeOdd(numbers);
        System.out.println("After deletions: ");
        print(numbers);
    }


    private static void zeroBeforeEven(ArrayList<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                numbers.add(i, 0);
                i++;
            }
        }
    }

    private static void removeOdd(ArrayList<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 != 0) {
                numbers.remove(i);
                i--;
            }
        }
    }

    private static void print(ArrayList<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    private static void reverse(ArrayList<Integer> list) {
        for (int i = list.size() - 1, j = 0; i > j; i--, j++) {
            int t = list.get(j);
            list.set(j, list.get(i));
            list.set(i, t);
        }
    }
}
