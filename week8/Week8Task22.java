import java.util.Scanner;

public class Week8Task22 {
    public static void main(String[] args) {
        double [] nums = new double[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            nums[i] = sc.nextDouble();
        }
        double minv = min(nums);
        System.out.println("The minimun number is: " + minv);
    }
    public static double min(double[] nums) {
        double min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }
}
