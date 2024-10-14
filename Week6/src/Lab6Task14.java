public class Lab6Task14 {
    public static void main(String[] args) {
        double tuition = 10000; // initial tuition
        double targetTuition = tuition * 2; // target tuition to be doubled
        int years = 0; // number of years needed

        // Loop until tuition doubles
        while (tuition < targetTuition) {
            tuition += tuition * 0.07; // increase tuition by 7%
            years++;
        }

        // Output the result
        System.out.println("The tuition will double in " + years + " years.");
    }
}