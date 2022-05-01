public class User {
    public double age;
    public double height;

    public User(double age, double height) {
        this.age = age;
        this.height = height;
    }
    public void validateUser(double age, double height) {
        if (age > 30 && height > 160) {
            System.out.println("User is older than 30 and higher than 160cm");
        }
        else {
            System.out.println("User is younger than 30 or lower than 160cm");
        }
    }
}
