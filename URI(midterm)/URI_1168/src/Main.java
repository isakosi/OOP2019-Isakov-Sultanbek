import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        char nums[];
        for (int i = 0; i < a; i++) {
            int led = 0;
            nums = scan.next().toCharArray();
            for(char num : nums){
                switch (num){
                    case '8':
                        led += 7;
                        break;
                    case '6':
                    case '9':
                    case '0':
                        led += 6;
                        break;
                    case '3':
                    case '2':
                    case '5':
                        led += 5;
                        break;
                    case '1':
                        led += 2;
                        break;
                    case '4':
                        led += 4;
                        break;
                    case '7':
                        led += 3;
                }
            }
            System.out.println(led + " leds");
        }
    }
}