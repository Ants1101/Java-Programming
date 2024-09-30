import java.util.Scanner;

public class Lab2Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weightInPounds = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double heightInInches = input.nextDouble();

        double weightInKilograms = weightInPounds * 0.45359237;

        double heightInMeters = heightInInches * 0.0254;

        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        System.out.printf("BMI is %.4f\n", bmi);

        input.close();
    }
}