public class Exercise_1_13 {
    public static void main(String[] args) {
        // 系数
        double a = 3.4;
        double b = 50.2;
        double c = 2.1;
        double d = 0.55;
        double e = 44.5;
        double f = 5.9;

        // 计算 ad - bc
        double denominator = a * d - b * c;

        // 确保 ad - bc 不等于 0
        if (denominator != 0) {
            // 计算 x 和 y
            double x = (e * d - b * f) / denominator;
            double y = (a * f - e * c) / denominator;

            System.out.println("x : " + x);
            System.out.println("y : " + y);
        } else {
            System.out.println("(ad - bc = 0)");
        }
    }
}
