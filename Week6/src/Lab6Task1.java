public class Lab6Task1 {
    public static void main(String[] args) {
        int sum = 0, i = 1;

        // Using a while loop to sum numbers from 1 to 10
        while (i <= 10) {
            sum += i;
            i++;
        }

        // Output the result
        System.out.println("sum is " + sum); // Expected output: sum is 55
    }
}