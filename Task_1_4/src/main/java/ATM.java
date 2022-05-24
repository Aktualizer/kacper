public class ATM extends Bank {
    protected void enterCard() {
        System.out.println("Enter Card");
    }

    protected void enterPIN() {
        System.out.println("Enter PIN:");
    }

    protected void enterAmount() {
        System.out.println("Enter Amount To Be Withdraw:");
    }

    protected void withdraw() {
        System.out.println("Cash Withdraw");
    }

    protected void thanks() {
        System.out.println("Thank You For Using Our Services!");
    }
}
