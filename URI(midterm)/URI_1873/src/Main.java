import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for (int i = 0; i < num; i++) {
            String raj, sheldon;
            raj = scan.next();
            sheldon = scan.next();
            if (raj.equals(sheldon)) {
                System.out.println("empate");
            } else {
                switch (raj) {
                    case "tesoura":
                        if (sheldon.equals("papel") || sheldon.equals("lagarto")) {
                            raj();
                        } else {
                            sheldon();
                        }
                        break;
                    case "pedra":
                        if (sheldon.equals("tesoura") || sheldon.equals("lagarto")) {
                            raj();
                        } else {
                            sheldon();
                        }
                        break;
                    case "papel":
                        if (sheldon.equals("spock") || sheldon.equals("pedra")) {
                            raj();
                        } else {
                            sheldon();
                        }
                        break;
                    case "lagarto":
                        if (sheldon.equals("papel") || sheldon.equals("spock")) {
                            raj();
                        } else {
                            sheldon();
                        }
                        break;
                    case "spock":
                        if (sheldon.equals("pedra") || sheldon.equals("tesoura")) {
                            raj();
                        } else {
                            sheldon();
                        }
                        break;
                }
            }
        }
    }

    public static void raj() {
        System.out.println("rajesh");
    }

    public static void sheldon() {
        System.out.println("sheldon");
    }
}