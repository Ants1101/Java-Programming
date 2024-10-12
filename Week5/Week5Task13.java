import java.util.Scanner;

public class Week5Task13 {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a character
        System.out.print("Enter a character: ");
        String userInput = input.nextLine();

        // Extract the first character using charAt(0)
        char character = userInput.charAt(0);

        // Display the entered character
        System.out.println("The character you entered is: " + character);
    }
}