public class Application {
    public static void main(String[] args) {
        Client client  = new Client();
        Order.morning();
        client.request();
        Cashier.answer1();
        client.requestTwo();
        Cashier.answer2();
        client.requestThree();
        Cashier.answer3();
        Order.theEnd();
    }
}
