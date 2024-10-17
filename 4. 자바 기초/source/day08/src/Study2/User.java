package Study2;

public class User {
    String name;
    int age;
    int year = 2024;

    public void showUserInfo(){
        System.out.printf("---현재년도 %d---%n",year);
        System.out.printf("%s 는 %d살 입니다.%n",name,age);
    }
}
