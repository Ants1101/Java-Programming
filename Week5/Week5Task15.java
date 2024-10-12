import java.util.Scanner;

public class Week5Task15 {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the first city
        System.out.print("Enter the first city: ");
        String city1 = input.nextLine();

        // Prompt the user to enter the second city
        System.out.print("Enter the second city: ");
        String city2 = input.nextLine();

        // Compare the two cities using the compareTo() method
        if (city1.compareTo(city2) < 0) {
            // city1 comes before city2 in alphabetical order
            System.out.println("The cities in alphabetical order are: " + city1 + " " + city2);
        } else {
            // city2 comes before city1 in alphabetical order
            System.out.println("The cities in alphabetical order are: " + city2 + " " + city1);
        }
    }
}