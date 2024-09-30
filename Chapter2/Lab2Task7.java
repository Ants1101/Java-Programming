import java.util.Scanner;

public class Lab2Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the driving distance: ");
        double distance = input.nextDouble();

        System.out.print("Enter miles per gallon: ");
        double milesPerGallon = input.nextDouble();

        // Prompt the user to enter the price per gallon
        System.out.print("Enter price per gallon: ");
        double pricePerGallon = input.nextDouble();

        // Calculate the cost of the trip
        double cost = (distance / milesPerGallon) * pricePerGallon;

        // Display the cost
        System.out.printf("The cost of driving is $%.2f\n", cost);

        // Close the scanner
        input.close();
    }
}