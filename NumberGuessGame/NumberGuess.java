import java.util.Random;
import java.util.Scanner;

public class NumberGuess {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numberToGuess = random.nextInt(50) + 1;
        int userGuess = 0;
        int attempts = 0;
        int MaxAttempts = 20;

        System.out.println(" Welcome to Number Guessing Game ");
        System.out.println("Guess a number between 1 and 50");

        while (userGuess != numberToGuess && attempts < MaxAttempts) {

            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();

            attempts++;

            if (userGuess < numberToGuess) {
                System.out.println("Your guess is too low!");
            } else if (userGuess > numberToGuess) {
                System.out.println("Your guess is too high!");
            } else {
                System.out.println(" Excellent! Correct Guess!");
                System.out.println(" You guessed the number in " + attempts + " attempts.");
            }
        }

        scanner.close();
    }
}
