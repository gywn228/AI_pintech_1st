package Study2;

public class PlusCon {

    public void PlusConMethod(int num1, int num2){
        System.out.println(num1 + num2);
    }

    public void PlusConMethod(int num1, int num2,int num3){
        System.out.println(num1 + num2 + num3);
    }

    public PlusCon(int num1, int num2){
        PlusConMethod(num1,num2);
    }

    public PlusCon(int num1, int num2, int num3){
        PlusConMethod(num1,num2,num3);
    }
}
