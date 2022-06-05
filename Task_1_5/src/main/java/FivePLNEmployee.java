public class FivePLNEmployee implements Employee{

    private double products;
    private double productsPayment;

    public FivePLNEmployee(double products, double productsPayment) {
        this.products = products;
        this.productsPayment = productsPayment;
    }

    @Override
    public double calculateSalary() {
        return this.products * this.productsPayment;
    }
}
