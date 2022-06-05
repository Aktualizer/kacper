public class Application {
    public static void main(String args[]) {

        FixedSalaryEmployee employee = new FixedSalaryEmployee(2000);
        HourlySalaryEmployee employee1 = new HourlySalaryEmployee(40, 19);
        FivePLNEmployee employee2 = new FivePLNEmployee(159, 5);
        TwentyPercentEmployee employee3 = new TwentyPercentEmployee(2000, 400);

        SalaryPayoutProcessor processor = new SalaryPayoutProcessor(employee2);
        processor.processPayout();
    }
}
