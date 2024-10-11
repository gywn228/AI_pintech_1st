package exam01;

public class Ex01 {
    // main 함수는 프로그램을 시작해 주는 함수
    public static void main(String[] args) {
        //int num1 = 10; // main 함수의 지역변수
       // int num2 = 20;
        //int result = add(num1, num2);
        //System.out.println(r);

        int result1 = add(10,20);
        System.out.println(result1);


    }

    // num1, num2, result - 함수 지역 내에서만 유의미한 변수 = 지역변수
    // add 함수의 지역변수
    static int add(int num1,int num2){ // 함수 지역
        int result = num1 + num2;

        return result;


    }
}
