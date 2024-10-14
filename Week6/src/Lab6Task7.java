public class Lab6Task7 {
    public static void main(String[] args) {
        int sum = 0;
        int j = 0; // Initialize j

        for (int i = 0; i < 10; i++) {
            sum += i;

            // Check if i is less than j
            if (i < j) {
                System.out.println(i);
            } else {
                System.out.println(j);
            }

            // Increment j until it reaches 10
            while (j < 10) {
                j++;
            }

            // Do-while loop is unnecessary here, so it's removed
        }

        // Print the final value of sum
        System.out.println("The final sum is " + sum);
    }
}