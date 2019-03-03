import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        while (scan.hasNextInt()) {
            numbers.add(scan.nextInt());
        }

        zeroBeforeEven(numbers);
        System.out.println("After insertions: ");
        print(numbers);

        removeOdd(numbers);
        System.out.println("After deletions: ");
        print(numbers);
    }

    private static void print(ArrayList<Integer> numbers) {
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    private static void zeroBeforeEven(ArrayList<Integer> numbers){
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0){
                numbers.add(i,0);
                i++;
            }
        }
    }
    private static void removeOdd(ArrayList<Integer> numbers){
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 != 0){
                numbers.remove(i);
                i--;
            }
        }
    }

}
