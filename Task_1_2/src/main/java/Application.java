public class Application {
    public static void main(String[] args) {
        ATMImpl bankomat = new ATMImpl();
        bankomat.connect();
        bankomat.deposit();
        bankomat.withdrawal();
        System.out.println(ATM.theEnd());

    }
}
