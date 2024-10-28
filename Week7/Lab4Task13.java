import java.util.Scanner;

public class Lab4Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number : ");
        String s = sc.nextLine();
        int x = Integer.parseInt(s, 16);
        System.out.println("The result is : "+x);
    }

}
