public class SalaryCalculator {
    public double multiplierPerDaysSkipped(int daysSkipped) {        
        return daysSkipped > 5 ? 0.85D: 1.00D;
    }

    public int multiplierPerProductsSold(int productsSold) {
        return productsSold > 20? 13: 10;
    }

    public double bonusForProductSold(int productsSold) {
        return (double)this.multiplierPerProductsSold(productsSold) * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = (1000.00D * this.multiplierPerDaysSkipped(daysSkipped)) + this.bonusForProductSold(productsSold);
        return salary >= 2000? 2000.00D: salary;
    } 
}
