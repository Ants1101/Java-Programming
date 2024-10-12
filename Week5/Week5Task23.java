import java.util.Scanner;

public class Week5Task23 {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the length from the center of a pentagon to a vertex (r)
        System.out.print("Enter the length from the center of the pentagon to a vertex: ");
        double r = input.nextDouble();

        // Compute the length of the side (s) using the formula s = 2r * sin(π / 5)
        double s = 2 * r * Math.sin(Math.PI / 5);

        // Compute the area of the pentagon using the formula Area = (5 * s^2) / (4 * tan(π / 5))
        double area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));

        // Round the result to 2 decimal places and display the area
        System.out.printf("The area of the pentagon is %.2f\n", area);
    }
}