public class Application {
    public static void main(String[] args) {
        User user = new User(30.1, 190);
        user.validateUser(30.4, 170);
    }
}
