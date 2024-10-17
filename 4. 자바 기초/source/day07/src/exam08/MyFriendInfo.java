package exam08;

public class MyFriendInfo {
    String name;
    int age;

    public MyFriendInfo(String name, int age){ // 이름,나이 생성자 만들기
        this.name = name;
        this.age = age;
    }

    public void MyFriendInfo2(){ // 이름,나이가 포함된 메소드 만들기
        System.out.printf("이름 : %s%n",name);
        System.out.printf("나이 : %d%n",age);
    }
}


