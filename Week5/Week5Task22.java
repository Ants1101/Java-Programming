import java.util.Scanner;

public class Week5Task22 {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a decimal value between 0 and 15
        System.out.print("Enter a decimal value (0 to 15): ");
        int decimal = input.nextInt();

        // Check if the input is within the valid range
        if (decimal >= 0 && decimal <= 15) {
            // Convert the decimal to a hexadecimal
            if (decimal < 10) {
                // For values 0 to 9, the hex is the same as the decimal
                System.out.println("The hex value is " + decimal);
            } else {
                // For values 10 to 15, use letters A to F
                char hexChar = (char) ('A' + (decimal - 10));
                System.out.println("The hex value is " + hexChar);
            }
        } else {
            // If the input is out of the range, display invalid input
            System.out.println(decimal + " is an invalid input.");
        }
    }
}