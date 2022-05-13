public class Client implements Order {

    @Override
    public void request() {
        System.out.println("I Would Like 3 Eggs And An Apple");
    }
    public void requestTwo() {
        System.out.println("I'D Have A Spaghetti");
    }
    public void requestThree() {
        System.out.println("Two number 9s, a number 9 large, a number 6 with extra dip," +
                " a number 7, two number 45s, one with cheese, and a large soda");
    }
}
