package exam03;
//사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고 1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
public class Ex03 {
    public static void main(String[] args) {
        int user = 20;
        int[] num = new int[user];
        for(int i = 0; i < num.length; i++){
            num[i] = i + 1;

        }


    }
}