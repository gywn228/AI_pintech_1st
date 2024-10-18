package Study3;
// 차의 색깔과 속도를 출력
public class Dog {
    // 멤버 변수
    String name; // 인스턴스 변수 정의
    String type;
    int age;

    public Dog(String name, String type, int age){
        this.name = name;
        this.type = type;
        this.age = age;
    }

    public void DogMethod(){ // 메소드 정의
        System.out.printf("강아지의 이름은 %s 이고, 견종은 %s, 나이는 %d살 입니다.%n", name,type,age);
    }
}
