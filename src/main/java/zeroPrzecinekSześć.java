public class zeroPrzecinekSześć {
}
    class User {

        private String name;
        private String surname;
        private String age;
        private String sex;

        public User(String name, String surname, String age, String sex) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.sex = sex;
        }

        public String getName() {
            return this.name;
        }

        public String getSurname() {
            return this.surname;
        }

        public String getAge() {
            return this.age;
        }

        public String getSex() {
            return this.sex;
        }

        public static void main(String[] args) {
            User user = new User("Adam", "Pala", "23", "male");

        }

        public void logIn() {

        }

        public void deleteUser() {

        }

    }

    class ForumUser extends User {

        private double nickName;
        private double numberOfPosts;

        public ForumUser(double nickName, double numberOfPosts, String name, String surname, String age, String sex) {
            super(name, surname, age, sex);
            this.nickName = nickName;
            this.numberOfPosts = numberOfPosts;
        }

        public void createPost() {

        }

        public void loggedIn() {

        }

    }