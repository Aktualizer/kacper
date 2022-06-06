public class Application {
    public static void main(String args[]) {

        FixedSalaryEmployee employee = new FixedSalaryEmployee(2000);
        HourlySalaryEmployee employee1 = new HourlySalaryEmployee(40, 19);
        FivePLNEmployee employee2 = new FivePLNEmployee(159, 5);
        PercentRaiseEmployee employee3 = new PercentRaiseEmployee(2000, 0.2);

        SalaryPayoutProcessor processor = new SalaryPayoutProcessor(employee3);
        processor.processPayout();
    }
}
