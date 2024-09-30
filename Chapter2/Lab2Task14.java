import java.util.Scanner;

public class Lab2Task14 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weightInPounds = input.nextDouble();

        // Prompt the user to enter height in inches
        System.out.print("Enter height in inches: ");
        double heightInInches = input.nextDouble();

        // Convert weight to kilograms
        double weightInKilograms = weightInPounds * 0.45359237;

        // Convert height to meters
        double heightInMeters = heightInInches * 0.0254;

        // Calculate BMI
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        // Display the BMI formatted to two decimal places
        System.out.printf("BMI is %.2f\n", bmi);

        // Classify the BMI
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 24.9) {
            System.out.println("Normal");
        } else if (bmi < 29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

        // Close the scanner
        input.close();
    }
}
