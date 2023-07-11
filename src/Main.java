import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ran = (int)(Math.random()*100);
        int user = 0;

        do {
            System.out.println("Guess my number(1-100) = ");
            user = sc.nextInt();
            if (user == ran){
                System.out.println("Wow!....Guessed correctly!");
                break;
            }
            else if (user > ran) {
                System.out.println("Your number is too large!");
            }
            else {
                System.out.println("Your number is too small!");
            }
        } while (user >=0 );

        System.out.print("My number was = ");
        System.out.println(ran);
    }
}