package exam03;

public class Q1 {
    public static void main(String[] args){
        String a = "" ;
    int user = 100;
    int[] studentNo = new int[user];
    String country = "민환" ;

    for(int i = 0; i < studentNo.length; i++){

        if (i % 4 == 0){
         country = "민환";
        } else if (i % 4 == 1) {
           country = "효주";
        } else if (i % 4 == 2) {
          country = "유나";
        } else if (i % 4 == 3) {
          country = "용호";
        }
        switch (country){
            case "민환":
                a = "태국";
                break;
            case "효주":
                a = "일본";
                break;
            case "유나":
                a = "미국";
                break;
            case "용호":
                a = "중국";
                break;
            default:
                System.out.println("그런 선생은 없는디?");
        }
        System.out.printf("%d번 학생의 담당자는 %s이며, %s를 갑니다.%n",i+1,country,a);
    }
    }
}