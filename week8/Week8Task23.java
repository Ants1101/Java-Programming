import java.util.Scanner;

public class Week8Task23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double []nums = new double[10];
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            nums[i] = sc.nextDouble();
        }
        double []temp = new double[10];
        System.out.println("This is the primary numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.print(nums[i]);
            System.out.print(" ");
            temp[10 - i - 1] = nums[i];
        }
        System.out.println();
        System.out.println("This is the reverse numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.print(temp[i]);
            System.out.print(" ");

        }
        System.out.println();
    }
}
