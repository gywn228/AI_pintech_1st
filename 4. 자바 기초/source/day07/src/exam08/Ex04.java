package exam08;

public class Ex04 {
    public static void main(String[] args) { // 상속없이 실행과정중에 메서드 재정의
        A a = new A(){
            @Override
            public void methodA() {
                System.out.println("재정의된 메서드A");;
            }
        };

        a.methodA();
    }
}
