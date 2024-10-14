public class Lab6Task12 {
    public static void main(String[] args) {
        int count = 0; // Count of prime numbers found
        int number = 2; // Start checking for primes from 2

        // Loop until we find the first 50 prime numbers
        while (count < 50) {
            if (isPrime(number)) {
                // Print the prime number
                System.out.printf("%-5d", number);
                count++;

                // Print a new line after every 10 prime numbers
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
            number++; // Check the next number
        }
    }

    // Method to determine if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }

        // Check for factors from 2 to the square root of n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // n is divisible by i, so it's not prime
            }
        }
        return true; // n is prime
    }
}