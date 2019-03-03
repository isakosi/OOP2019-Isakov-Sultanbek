import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();

        while (scan.hasNextInt()) {
            list.add(scan.nextInt());
        }

        System.out.println("Before reversing:");
        print(list);

        System.out.println("After reversing:");
        reverse(list);
        print(list);
    }

    private static void print (ArrayList<Integer> list){

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
    private static void reverse (ArrayList<Integer> list){
        for (int i = list.size() - 1, j = 0; i > j; i--, j++) {
            int t = list.get(j);
            list.set(j, list.get(i));
            list.set(i,t);
        }
    }
}