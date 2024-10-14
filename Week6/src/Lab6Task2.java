import java.util.Scanner;

public class Lab6Task2 {
    public static void main(String[] args) {
        // Generate two random numbers between 0 and 9
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        Scanner input = new Scanner(System.in);
        int answer;

        // Prompt the user to solve the addition problem
        do {
            System.out.print("What is " + number1 + " + " + number2 + "? ");
            answer = input.nextInt();

            if (answer != number1 + number2) {
                System.out.println("Wrong answer. Try again.");
            }
        } while (answer != number1 + number2);

        System.out.println("You got it!");
        input.close();
    }
}