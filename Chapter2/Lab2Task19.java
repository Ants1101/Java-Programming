import java.util.Random;
import java.util.Scanner;

public class Lab2Task19 {
    public static void main(String[] args) {
        // Create a Random object to generate random numbers
        Random random = new Random();
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Generate two random single-digit integers (0-9)
        int number1 = random.nextInt(10); // Generates a number between 0 and 9
        int number2 = random.nextInt(10); // Generates a number between 0 and 9

        // Display the math question
        System.out.print("What is " + number1 + " + " + number2 + "? ");

        // Read the user's answer
        int userAnswer = input.nextInt();

        // Calculate the correct answer
        int correctAnswer = number1 + number2;

        // Check if the user's answer is correct
        if (userAnswer == correctAnswer) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The correct answer is " + correctAnswer + ".");
        }

        // Close the scanner
        input.close();
    }
}