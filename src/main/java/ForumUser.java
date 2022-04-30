public class ForumUser extends User{
    private String nickName;
    private String name;
    private String surname;
    private String age;
    private String sex;
    private int numberOfPosts;
    private boolean logIn;
    User user = new User("Adam", "Pala", "23", "male", true);


    public ForumUser(String nickName, int numberOfPosts, boolean logIn) {
        super("Adam", "Pala", "23", "male", true);
        this.nickName = nickName;
        this.name = user.getName();
        this.surname = user.getSurname();
        this.age = user.getAge();
        this.sex = user.getSex();
        this.numberOfPosts = numberOfPosts;
        this.logIn = logIn;
    }

    public void createPost() {

    }

    public boolean loggedIn() {
        return logIn;
    }

    public void introduceForumUser() {
         System.out.println("User name is: " + user.getName() + " User surname is: " +
                user.getSurname() + " User age is: " +  user.getAge() + " User sex is: " + user.getSex());
    }
}
