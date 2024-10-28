import java.util.Scanner;

public class Lab4Task14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer : ");
        int a = input.nextInt();
        System.out.print("Enter second integer : ");
        int b = input.nextInt();
        System.out.println("The greatest common divisor for " + a + " and " + b + " is " + gcd(a,b));

    }
    public static int gcd(int a, int b) {
        return b==0?a:gcd(b,a%b);
    }
}
