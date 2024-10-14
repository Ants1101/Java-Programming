import java.util.Scanner;

public class Lab6Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two positive integers
        System.out.print("Enter the first positive integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second positive integer: ");
        int num2 = scanner.nextInt();

        // Find the GCD
        int gcd = findGCD(num1, num2);

        // Display the result
        System.out.println("The greatest common divisor of " + num1 + " and " + num2 + " is " + gcd);

        scanner.close();
    }

    // Method to find the GCD using the Euclidean algorithm
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}