package exam02;

public class Ex02 {
    public static void main(String[] args) {
        String str = "ABC";
        System.out.println(System.identityHashCode(str)); // 주소값 출력 // 189568618

        str += "DEF";
        System.out.println(System.identityHashCode(str)); // 1922154895

        str += "GHI";
        System.out.println(System.identityHashCode(str)); // 883049899
        // 문자를 결합할때마다 새로운 객체 생성 -> 주소값이 다 다르다 -> 문자열 불변특징

        System.out.println(str); //ABCDEFGHI
    }
}
