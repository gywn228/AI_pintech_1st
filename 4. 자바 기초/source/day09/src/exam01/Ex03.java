package exam01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Ex03 {
    public static void main(String[] args) throws Exception {
        // Person 클래스의 Class 객체를 가져옴 (클래스 정보를 담고 있음)
        Class<Person> cls = Person.class;

        // Person 클래스의 기본 생성자를 가져옴
        Constructor con = cls.getDeclaredConstructor();

        // 기본 생성자를 통해 Person 객체를 생성함
        Object obj = con.newInstance();

        // Person 클래스의 setAge 메서드(매개변수 타입이 int)를 가져옴
        Method m1 = cls.getDeclaredMethod("setAge", int.class);

        // m1(즉, setAge 메서드)을 obj 객체에 20이라는 값으로 호출 (age를 20으로 설정)
        Object r1 = m1.invoke(obj, 20);

        // setAge 메서드는 리턴값이 없으므로 null이 출력됨
        System.out.println(r1);

        // Person 클래스의 getAge 메서드를 가져옴
        Method m2 = cls.getDeclaredMethod("getAge");

        // m2(즉, getAge 메서드)을 obj 객체에 호출하여 나이를 가져옴
        Object r2 = m2.invoke(obj);

        // getAge의 반환 값인 r2(Object 타입)를 int로 캐스팅
        int age = (int)r2;

        // 나이 20이 출력됨
        System.out.println(age);

        // obj 객체(Person 객체의 정보)가 출력됨 (toString이 재정의되어 있을 경우 해당 내용 출력)
        System.out.println(obj);
    }
}


