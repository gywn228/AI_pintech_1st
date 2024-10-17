package Study2;

public class Plus {

    private int num1 = 10;
    private int num2 = 20;

    private int plusMethod(int num1, int num2){
        return this.num1 + this.num2 + num1 + num2;

    }

    public void publicPlusMethod(int num1, int num2){
        System.out.println(plusMethod(num1,num2));
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}
