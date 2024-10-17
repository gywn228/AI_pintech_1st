package Study;

public class UserMain {
    public static void main(String[] args) {
        User user = new User();
        user.name = "김효주";
        user.age = 26;

        user.showUserInfo();

        user.year++;
        user.age++;

        user.showUserInfo();

        User user1 = new User();
        user1.name = "김유나";
        user1.age = 26;

        user1.showUserInfo();
    }
}
