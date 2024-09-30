import java.util.Scanner;

public class Lab2Task12 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Check if the number is a multiple of 5
        if (number % 5 == 0) {
            System.out.println("HiFive");
        }

        // Check if the number is even
        if (number % 2 == 0) {
            System.out.println("HiEven");
        }

        // Close the scanner
        input.close();
    }
}
