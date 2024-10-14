import java.util.Scanner;

public class Lab6Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0; // Variable to store the sum of the numbers
        int number;  // Variable to store the current number

        // Prompt the user to enter integers until 0 is entered
        System.out.println("Enter integers to sum (enter 0 to end):");

        // Use a do-while loop to read integers and calculate the sum
        do {
            number = scanner.nextInt(); // Read the next integer

            // Add the number to the sum if it's not the sentinel value
            if (number != 0) {
                sum += number;
            }
        } while (number != 0); // Continue the loop until 0 is entered

        // Display the total sum
        System.out.println("The sum of the entered numbers is: " + sum);

        // Close the scanner
        scanner.close();
    }
}