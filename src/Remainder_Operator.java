public class Remainder_Operator {
    public static void main(String[] args) {
        // 今天是周二，周二用数字2表示
        int today = 2;

        // 一百天后的天数
        int daysAfter = 100;

        // 一周有7天，使用模运算符计算一百天后的周几
        int futureDay = (today + daysAfter) % 7;

        // 输出结果
        switch(futureDay) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }
    }
}
