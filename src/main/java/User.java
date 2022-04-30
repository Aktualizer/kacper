public class User {

    private String name;
    private String surname;
    private String age;
    private String sex;
    private boolean logIn;

    public User(String name, String surname, String age, String sex, boolean logIn) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
        this.logIn = logIn;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public void logIn() {
    }

    public void deleteUser() {

    }

}

