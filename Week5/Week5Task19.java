public class Week5Task19 {
    public static void main(String[] args) {
        // Declare variables
        int largeNumber = 12345678;
        double largeAmount = 12345678.263;

        // Display number and amount with thousand separators
        System.out.printf("Formatted number with thousand separator: %,8d\n", largeNumber);
        System.out.printf("Formatted amount with thousand separator: %,10.1f\n", largeAmount);
    }
}