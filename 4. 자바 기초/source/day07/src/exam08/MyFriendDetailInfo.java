package exam08;

public class MyFriendDetailInfo extends MyFriendInfo{ // extends 로 클래스 상속
        String addr;
        String phone;

    public MyFriendDetailInfo(String name, int age, String addr, String phone) {
        super(name, age); // 상위 클래스의 생성자 호출
        this.addr = addr; // 주소,전화 생성자 만들기
        this.phone = phone;
    }

    public void MyFriendDetailInfo2(){
        MyFriendInfo2();
        System.out.printf("주소 : %s%n",addr); // 주소,전화가 포함된 메소드 만들기
        System.out.printf("전화 : %s%n",phone);
    }
}
