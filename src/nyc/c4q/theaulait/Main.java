package nyc.c4q.theaulait;

import java.util.Scanner;

public class Main {
    public static int fibonacci(int number) {
        int fZero = 0;
        int fOne = 1;
        int result = 1;

        if (number < 1) {
            System.err.println("Please enter a numerical number greater than one");
            return 0;
        }
            if (number == 1 || number == 2)
            {
                return 1;
            }  // I want the calculation to start at the 3th # because the first two fibonacci # are 0 and 1.
                for
                        (int i = 3; i <= number; i++) {
                        result = fZero + fOne;
                        fZero = fOne;
                        fOne = result;
                }
        return result;
    }
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);{
        int number;
        System.out.println("Please enter a numerical number one and greater.");
        number = input.nextInt();
        System.out.println("Your answer is: " + fibonacci(number));
        }
    }
}
