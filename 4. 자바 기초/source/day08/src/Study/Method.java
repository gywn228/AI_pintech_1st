package Study;

public class Method {
    public static void main(String[] args) {
        method("김효주");
        System.out.println(method2("김효주"));
    }
    public static void method(String x){
        System.out.println(x + "님 안녕하세요.");
    }
    public static String method2(String x){
        return x + "님 안녕하세요!";
    }
}
