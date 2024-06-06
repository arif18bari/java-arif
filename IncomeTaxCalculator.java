public class IncomeTaxCalculator {

    public static double calculateIncomeTax(double income) {
        double tax = 0.0;
        
        if (income <= 350000) {
            return tax; // No tax for income up to 3.5 lac
        }
        
        income -= 350000;
        
        if (income <= 100000) {
            tax += income * 0.05;
            return tax;
        } else {
            tax += 100000 * 0.05;
            income -= 100000;
        }
        
        if (income <= 400000) {
            tax += income * 0.10;
            return tax;
        } else {
            tax += 400000 * 0.10;
            income -= 400000;
        }
        
        if (income <= 500000) {
            tax += income * 0.15;
            return tax;
        } else {
            tax += 500000 * 0.15;
            income -= 500000;
        }
        
        if (income <= 500000) {
            tax += income * 0.20;
            return tax;
        } else {
            tax += 500000 * 0.20;
            income -= 500000;
        }
        
        if (income <= 2000000) {
            tax += income * 0.25;
            return tax;
        } else {
            tax += 2000000 * 0.25;
            income -= 2000000;
        }
        
        // Income above 35 lac
        tax += income * 0.30;
        
        return tax;
    }

    public static void main(String[] args) {
        double income = 1350000; // Example income
        double tax = calculateIncomeTax(income);
        System.out.println("The income tax for an income of " + income + " is: " + tax);
    }
}
