public class Exercise_1_10 {
    public static void main(String[] args) {
        double kilometers = 14;
        double miles = kilometers / 1.6;
        double timeInHours = (45 * 60 + 30) / 3600.0;  // 将45分钟30秒转换为小时
        double averageSpeed = miles / timeInHours;

        System.out.println("Average Speed: " + averageSpeed);
    }
}
