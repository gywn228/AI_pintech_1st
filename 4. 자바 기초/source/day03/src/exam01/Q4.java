package exam01;

public class Q4 {
    //구구단을 홀수 단만 출력하도록 프로그램을 만드시오. 구현 소스

    public static void main(String[] args) {
        for(int i = 2; i <= 9; i++){ // 단
            System.out.printf("--- %d단 ---%n",i);
            if (i % 2 == 1){
            for(int j = 1; j <= 9; j++){ // 곱하는 수
                System.out.printf("%d x %d = %d%n",i,j,i*j);
                }
            }
        }
    }
}
