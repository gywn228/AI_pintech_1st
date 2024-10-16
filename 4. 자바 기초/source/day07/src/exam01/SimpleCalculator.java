package exam01;

public class SimpleCalculator extends Calculator{ //단일상속 : 한개의 클래스만 상속 받을수 있다

    public SimpleCalculator(){
        super();
    }

    @Override
    public int add(int num1, int num2) { // 인스턴스 메서드
        return num1 + num2;
    }
}
