public class Exercise_1_12 {
    public static void main(String[] args) {
        // 输入数据
        double miles = 24;
        double kilometers = miles * 1.6; // 将英里转换为公里

        // 时间转换为小时
        double hours = 1 + (40.0 / 60) + (35.0 / 3600);

        // 计算平均速度
        double averageSpeed = kilometers / hours;

        System.out.println("Average Speed: " + averageSpeed);
    }
}
