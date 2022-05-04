public class ATMImpl implements ATM {

    @Override
    public void withdrawal() {
        System.out.println("Welcome");
        System.out.println("Enter Card");
        System.out.println("Enter PIN");
        System.out.println("Enter The Amount To Be Withdrawn");
        System.out.println("Proceed");
    }

    @Override
    public void deposit() {
        System.out.println("Welcome");
        System.out.println("Enter Card");
        System.out.println("Enter PIN");
        System.out.println("Prepare The Banknotes");
        System.out.println("Opening The Locker...");
        System.out.println("Verification");
    }
}
