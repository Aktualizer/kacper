public interface Order {
    void request();
    static void morning() {
        System.out.println("Good Morning");
    }
    static void theEnd() {
        System.out.println("Goodbye");
    }
}
