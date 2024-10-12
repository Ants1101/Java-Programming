import java.util.Scanner;

public class Week5Task24 {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a letter
        System.out.print("Enter a letter: ");
        String userInput = input.nextLine();

        // Check if input is exactly one character and a letter
        if (userInput.length() == 1 && Character.isLetter(userInput.charAt(0))) {
            char letter = Character.toLowerCase(userInput.charAt(0)); // Convert to lowercase for easy comparison

            // Check if the letter is a vowel or consonant
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                System.out.println(userInput.charAt(0) + " is a vowel");
            } else {
                System.out.println(userInput.charAt(0) + " is a consonant");
            }
        } else {
            System.out.println(userInput + " is an invalid input.");
        }
    }
}