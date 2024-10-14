package exam05;
//10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇개인지 출력하는 프로그램

public class Q1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int count=0;
        for (int i = 0; i < 10; i++){
            if (arr[i] % 2 == 1){
                continue;
            } else if (arr[i] % 2 == 0) {
                count++;
            }

        }
        System.out.printf("짝수의 갯수 : %d%n",count);
    }
}
