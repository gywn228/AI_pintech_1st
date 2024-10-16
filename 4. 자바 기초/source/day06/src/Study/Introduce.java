package Study;

public class Introduce {
    String name;
    int age;
    String adr;

    public Introduce(String name,int age, String adr){
        System.out.println("자기소개 시작");
        this.name = name;
        this.age = age;
        this.adr = adr;

    }


    void Introduce2(){
        System.out.printf("저의 이름은 %s 이고 나이는 %d살 이며 사는곳은 %s 입니다.%n",name,age,adr);
    }


}
