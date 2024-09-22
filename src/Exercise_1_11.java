public class Exercise_1_11 {
    public static void main(String[] args) {
        int currentPopulation = 312032486;
        int secondsPerYear = 365*24*60*60;

        int birthInterval = 7;
        int deathInterval = 13;
        int immigrantInterval = 45;

        int birthsPerYear = secondsPerYear / birthInterval;
        int deathsPerYear = secondsPerYear / deathInterval;
        int immigrantsPerYear = secondsPerYear / immigrantInterval;

        // 输出未来五年的预测人口数
        for (int i = 1; i <= 5; i++) {
            currentPopulation = currentPopulation + birthsPerYear - deathsPerYear + immigrantsPerYear;
            System.out.println("Year " + i + " population: " + currentPopulation);
        }
    }
}
