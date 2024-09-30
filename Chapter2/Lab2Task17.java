import java.util.Random;
import java.util.Scanner;

public class Lab2Task17 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        // Generate a random two-digit lottery number
        int lotteryNumber = random.nextInt(90) + 10; // Random number between 10 and 99
        System.out.println("The lottery number is " + lotteryNumber);

        // Prompt the user to enter their lottery pick (two digits)
        System.out.print("Enter your lottery pick (two digits): ");
        int userPick = input.nextInt();

        // Check for exact match
        if (userPick == lotteryNumber) {
            System.out.println("Exact match: you win $10,000");
        } else {
            // Convert both numbers to strings to check for digit matches
            String lotteryStr = String.format("%02d", lotteryNumber);
            String userPickStr = String.format("%02d", userPick);

            // Check if both digits match (in any order)
            if (lotteryStr.charAt(0) == userPickStr.charAt(0) && lotteryStr.charAt(1) == userPickStr.charAt(1)) {
                System.out.println("Match all digits: you win $3,000");
            } else if (lotteryStr.charAt(0) == userPickStr.charAt(1) || lotteryStr.charAt(1) == userPickStr.charAt(0)) {
                System.out.println("Match one digit: you win $1,000");
            } else {
                System.out.println("Sorry: no match");
            }
        }

        // Close the scanner
        input.close();
    }
}
