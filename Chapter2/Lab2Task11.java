import java.util.Scanner;

public class Lab2Task11 {
    public static void main(String[] args) {
        // Constants
        final double SALES_TAX_RATE = 0.06; // Sales tax rate (6%)

        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the purchase amount
        System.out.print("Enter purchase amount: ");
        double purchaseAmount = input.nextDouble();

        // Calculate the sales tax
        double salesTax = purchaseAmount * SALES_TAX_RATE;

        // Display the sales tax formatted to two decimal places
        System.out.printf("Sales tax is $%.2f\n", salesTax);

        // Close the scanner
        input.close();
    }
}