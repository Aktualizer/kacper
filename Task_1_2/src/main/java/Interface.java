interface ATM {
    void withdrawal();

    void deposit();

    default String connect() {
        System.out.println("Connection to bank established");
        return null;
    }

    static String theEnd() {
        return "Thank You For Using Our Services!";
    }

}


