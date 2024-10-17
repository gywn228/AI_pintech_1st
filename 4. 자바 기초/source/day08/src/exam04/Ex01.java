package exam04;

public class Ex01 {
    public static void main(String[] args) {
        Customer c1 = new Customer(1000, "이이름","user01@test.org");
        Customer c2 = new Customer(1000,"이이름","user01@test.org");
        System.out.printf("c1 == c2 : 동일성 ? %s%n",c1 == c2); // 객체의 주소가 다르기 때문에 false
        System.out.printf("c1.equals(c2) : 동등성 ? %s%n",c1.equals(c2));
        System.out.printf("c1 주소 ? %d%n",System.identityHashCode(c1));
        System.out.printf("c2 주소 ? %d%n",System.identityHashCode(c2));
    }
}
