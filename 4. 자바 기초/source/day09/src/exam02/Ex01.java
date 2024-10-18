package exam02;

public class Ex01 {
    public static void main(String[] args) {
        String str1 = "ABC"; // 문자열 상수 // 문자는 객체, 자원이 힙에 있다
        String str2 = "ABC"; // 문자열 상수
        System.out.printf("str1.equals(str2):%s%n",str1.equals(str2)); // 동등성 비교 : 값이 같은지 비교// true
        System.out.printf("str1 == str2:%s%n",str1 == str2); // 동일성 비교 : 주소값이 같은지 비교 // true

        System.out.printf("str1 주소: %d%n",System.identityHashCode(str1)); // 큰따옴표로 감싸면 주소값이 같다
        System.out.printf("str2 주소: %d%n",System.identityHashCode(str2));
    }
}
