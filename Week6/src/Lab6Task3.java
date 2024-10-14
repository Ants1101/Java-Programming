import java.util.Scanner;

public class Lab6Task3 {
    public static void main(String[] args) {
        // Generate a random number between 0 and 100
        int number = (int)(Math.random() * 101);

        Scanner input = new Scanner(System.in);
        int guess = -1;

        // Prompt the user to guess the number
        System.out.println("Guess a magic number between 0 and 100");

        while (guess != number) {
            // Read the user's guess
            System.out.print("Enter your guess: ");
            guess = input.nextInt();

            // Check if the guess is correct, too high, or too low
            if (guess == number) {
                System.out.println("Yes, the number is " + number);
            } else if (guess > number) {
                System.out.println("Your guess is too high");
            } else {
                System.out.println("Your guess is too low");
            }
        }

        input.close();
    }
}