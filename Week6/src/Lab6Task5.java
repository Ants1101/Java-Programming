import java.util.Scanner;

public class Lab6Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0; // Variable to store the sum of the numbers

        // Prompt the user to enter integers until 0 is entered
        System.out.println("Enter integers to sum (enter 0 to end):");

        // Loop to read integers until 0 is entered
        while (true) {
            int number = scanner.nextInt(); // Read the next integer

            // Check if the input is the sentinel value (0)
            if (number == 0) {
                break; // Exit the loop
            }

            // Add the number to the sum
            sum += number;
        }

        // Display the total sum
        System.out.println("The sum of the entered numbers is: " + sum);

        // Close the scanner
        scanner.close();
    }
}
