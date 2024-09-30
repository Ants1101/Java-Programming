import java.util.Scanner;

public class Lab2Task9 {
    public static void main(String[] args) {
        // Constants
        final double MONTHLY_INTEREST_RATE = 0.05 / 12; // Monthly interest rate
        final double MONTHLY_SAVING_AMOUNT = 100.0; // Amount saved each month
        final int NUMBER_OF_MONTHS = 12; // Number of months to calculate

        // Initialize the total amount in the account
        double totalAmount = 0.0;

        // Calculate the compound value
        for (int month = 1; month <= NUMBER_OF_MONTHS; month++) {
            totalAmount = (totalAmount + MONTHLY_SAVING_AMOUNT) * (1 + MONTHLY_INTEREST_RATE);
        }

        // Display the total amount after 12 months
        System.out.printf("The total amount in the account after %d months is: $%.2f\n", NUMBER_OF_MONTHS, totalAmount);
    }
}