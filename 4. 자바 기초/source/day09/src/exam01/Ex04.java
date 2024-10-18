package exam01;

public class Ex04 {
    public static void main(String[] args) throws ClassNotFoundException{
        Class cls = Class.forName("exam01.Person"); // 동적 로드
        System.out.println(cls); // class exam01.Person
    }
}
