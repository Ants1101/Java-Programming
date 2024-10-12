public class Week5Task18 {
    public static void main(String[] args) {
        // Declare variables for amount, interest rate, and interest calculation
        double amount = 12618.98;
        double interestRate = 0.0013;
        double interest = amount * interestRate;

        // Display interest without formatting
        System.out.println("Interest is $" + interest);

        // Display interest with formatting (two decimal points)
        System.out.printf("Interest with two decimal points is $%.2f\n", interest);

        // Additional example with count and amount
        int count = 5;
        double anotherAmount = 45.56;
        System.out.printf("Count is %d and amount is %.2f\n", count, anotherAmount);
    }
}