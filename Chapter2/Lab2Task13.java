import java.util.Scanner;

public class Lab2Task13 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the current pay
        System.out.print("Enter current pay: ");
        double currentPay = input.nextDouble();

        // Prompt the user to enter the score
        System.out.print("Enter score: ");
        int score = input.nextInt();

        // Calculate the new pay based on the score
        if (score > 90) {
            currentPay *= 1.03; // Increase pay by 3%
        } else {
            currentPay *= 1.01; // Increase pay by 1%
        }

        // Display the new pay
        System.out.printf("The new pay is: $%.2f\n", currentPay);

        // Close the scanner
        input.close();
    }
}