import java.util.Scanner;

public class Lab2Task20 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a year
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Determine the Chinese Zodiac sign using a switch statement
        String zodiacSign;
        switch (year % 12) {
            case 0:
                zodiacSign = "Monkey";
                break;
            case 1:
                zodiacSign = "Rooster";
                break;
            case 2:
                zodiacSign = "Dog";
                break;
            case 3:
                zodiacSign = "Pig";
                break;
            case 4:
                zodiacSign = "Rat";
                break;
            case 5:
                zodiacSign = "Ox";
                break;
            case 6:
                zodiacSign = "Tiger";
                break;
            case 7:
                zodiacSign = "Rabbit";
                break;
            case 8:
                zodiacSign = "Dragon";
                break;
            case 9:
                zodiacSign = "Snake";
                break;
            case 10:
                zodiacSign = "Horse";
                break;
            case 11:
                zodiacSign = "Sheep";
                break;
            default:
                zodiacSign = "Unknown";
        }

        // Display the result
        System.out.println("The Chinese Zodiac sign for the year " + year + " is: " + zodiacSign);

        // Close the scanner
        input.close();
    }
}