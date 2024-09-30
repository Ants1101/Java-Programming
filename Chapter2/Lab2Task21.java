import java.util.Scanner;

public class Lab2Task21 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a day number
        System.out.print("Enter the day number (0-6): ");
        int day = input.nextInt();

        // Switch statement to determine if it's a weekday or weekend
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 0:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid day number! Please enter a number between 0 and 6.");
        }

        // Close the scanner
        input.close();
    }
}
