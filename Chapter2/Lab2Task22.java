public class Lab2Task22 {
    public static void main(String[] args) {
        int x = 1;
        int a = 3;

        // Switch statement to determine the value of x
        switch (a) {
            case 1:
                x += 5;
                break;
            case 2:
                x += 10;
                break;
            case 3:
                x += 16;
                break;
            case 4:
                x += 34;
                break;
            default:
                // Optionally handle unexpected values of 'a'
                break;
        }

        // Output the final value of x
        System.out.println("The value of x is: " + x);
    }
}