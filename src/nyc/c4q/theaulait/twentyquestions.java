package nyc.c4q.theaulait;

/**
 * Created by c4q-vanice on 3/20/15.
 */
import java.util.Random;
import java.util.Scanner;

public class twentyquestions {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(10000) + 1;
        Scanner scanner = new Scanner(System.in);
        int usernum = 0;

        for (int i = 20; i > 0; i--) {

            System.out.println("Guess X from 1- 10,000. You have " + i + " guess.");
            usernum = scanner.nextInt();

            if (usernum > number) {
                System.out.println("Input number is higher than X");
            } else if (usernum < number) {
                System.out.println("Input number is lower than X");
            } else {
                System.out.println("You win!");
            break;
            }

            if (i == 0) {
                System.err.println("You lose!");
            }
        }
    }
}
