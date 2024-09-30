import java.util.Scanner;

public class Lab2Task10 {
    public static void main(String[] args) {
        // Constants
        final double MONTHLY_INTEREST_RATE = 0.05 / 12; // Monthly interest rate
        final int NUMBER_OF_MONTHS = 6; // Number of months to calculate

        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the monthly saving amount
        System.out.print("Enter the monthly saving amount: ");
        double monthlySavingAmount = input.nextDouble();

        // Initialize the total amount in the account
        double totalAmount = 0.0;

        // Calculate the compound value after the specified number of months
        for (int month = 1; month <= NUMBER_OF_MONTHS; month++) {
            totalAmount = (totalAmount + monthlySavingAmount) * (1 + MONTHLY_INTEREST_RATE);
        }

        // Display the total amount after 6 months
        System.out.printf("After the sixth month, the account value is $%.2f\n", totalAmount);

        // Close the scanner
        input.close();
    }
}
