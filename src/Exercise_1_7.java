public class Exercise_1_7 {
    public static void main(String[] args) {
        // First approximation: up to 1/11
        double piApprox1 = 4 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11);
        // Second approximation: up to 1/13
        double piApprox2 = 4 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13);

        System.out.println("Approximation of π (up to 1/11): " + piApprox1);
        System.out.println("Approximation of π (up to 1/13): " + piApprox2);
    }
}
