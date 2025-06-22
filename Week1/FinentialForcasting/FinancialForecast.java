public class FinancialForecast {

    
    public static double forecastValue(double initialValue, double rate, int years) {
        
        if (years == 0) {
            return initialValue;
        }
        return forecastValue(initialValue, rate, years - 1) * (1 + rate);
    }

    public static void main(String[] args) {
        double initialValue = 1000.0; 
        double rate = 0.05; 
        int years = 5;

        double futureValue = forecastValue(initialValue, rate, years);

        System.out.printf("Future Value after %d years = %.2f%n", years, futureValue);
    }
}
