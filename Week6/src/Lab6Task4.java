import java.util.Scanner;

public class Lab6Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Loop to generate five questions
        for (int i = 0; i < 5; i++) {
            // Generate two random numbers between 0 and 9
            int number1 = (int)(Math.random() * 10);
            int number2 = (int)(Math.random() * 10);

            // Ensure number1 is larger for subtraction
            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }

            // Prompt the user for the subtraction answer
            System.out.print("What is " + number1 + " - " + number2 + "? ");
            int answer = input.nextInt();

            // Check the answer
            if (answer == number1 - number2) {
                System.out.println("You are correct!");
            } else {
                System.out.println("Your answer is wrong. " + number1 + " - " + number2 + " should be " + (number1 - number2));
            }
        }

        input.close();
    }
}
