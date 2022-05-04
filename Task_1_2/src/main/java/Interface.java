interface ATM {
    void withdrawal();

    void deposit();

    default void connect() {
        System.out.println("Connection to bank established");
    }

    static void theEnd() {
        System.out.println("Thank You For Using Our Services!");
    }
}


