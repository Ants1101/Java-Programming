import java.util.Scanner;

public class Lab2Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter today's day (0 for Sunday, 1 for Monday, ..., 6 for Saturday): ");
        int today = input.nextInt();

        System.out.print("Enter the number of days to add: ");
        int daysToAdd = input.nextInt();

        int futureDay = (today + daysToAdd) % 7;

        String dayName = "";
        switch (futureDay) {
            case 0: dayName = "Sunday"; break;
            case 1: dayName = "Monday"; break;
            case 2: dayName = "Tuesday"; break;
            case 3: dayName = "Wednesday"; break;
            case 4: dayName = "Thursday"; break;
            case 5: dayName = "Friday"; break;
            case 6: dayName = "Saturday"; break;
        }

        System.out.println("The day in " + daysToAdd + " days will be: " + dayName);

        input.close();
    }
}