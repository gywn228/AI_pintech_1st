package Study2;

public class UserMain {
    public static void main(String[] args) {
        User user = new User();
        user.name = "김효주";
        user.age = 26;


        user.showUserInfo();

        user.age += 1;
        user.year += 1;

        user.showUserInfo();
    }
}
