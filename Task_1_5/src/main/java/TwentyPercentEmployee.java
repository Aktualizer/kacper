public class TwentyPercentEmployee implements Employee{

    private double basicPayment;
    private double multiplier;

    public TwentyPercentEmployee(double basicPayment, double multiplier) {
        this.basicPayment = basicPayment;
        this.multiplier = multiplier;
    }

    @Override
    public double calculateSalary() {
        return this.basicPayment + this.multiplier;
    }
}
