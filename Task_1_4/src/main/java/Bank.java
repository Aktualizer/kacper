abstract class Bank {
    abstract protected void enterCard();

    abstract protected void enterPIN();

    abstract protected void enterAmount();

    abstract protected void withdraw();

    abstract protected void thanks();

    private void request() {
        System.out.println("Request Accepted");
    }

    private void checking() {
        System.out.println("Checking Account Balance...");
    }

    private void accept() {
        System.out.println("You Can Withdraw");
    }

    public void process() {
        this.enterCard();
        this.enterPIN();
        this.enterAmount();
        this.request();
        this.checking();
        this.accept();
        this.withdraw();
        this.thanks();

    }
}