import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame{

    public static void main(String[] args) {

        int randomNumber = (int) (Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess = 0;
        int attempts = 0;
        while (guess != randomNumber) {
            System.out.print("Guess a number between 1 and 100: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess > randomNumber) {
                System.out.println("Too high!");
            } else if (guess < randomNumber) {
                System.out.println("Too low!");
            } else {
                System.out.println("Correct! You guessed the number in " + attempts + " attempts.");
            }
        }

        scanner.close();

    }
}