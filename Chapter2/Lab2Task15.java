import java.util.Scanner;

public class Lab2Task15 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Check if the number is divisible by 2 and 3
        if (number % 2 == 0 && number % 3 == 0) {
            System.out.println(number + " is divisible by 2 and 3.");
        }

        // Check if the number is divisible by 2 or 3
        if (number % 2 == 0 || number % 3 == 0) {
            System.out.println(number + " is divisible by 2 or 3.");
        }

        // Check if the number is divisible by 2 or 3 but not both
        if (number % 2 == 0 ^ number % 3 == 0) {
            System.out.println(number + " is divisible by 2 or 3, but not both.");
        }

        // Close the scanner
        input.close();
    }
}