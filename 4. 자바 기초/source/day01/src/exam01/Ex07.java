package exam01;

public class Ex07 {
    public static void main(String[] args) {
        //long num1 = 10000000000; // int -> long
        long num1 = 10000000000L; // 처음부터 long으로 인식
        long num3 = 10_000_000_000L; // _(언더바)를 붙히는 이유는 가독성을 높이기 위해서이다.
        byte num2 = 100; // int 100 -> byte 변환 (일 2번)
    }
}
