package Study;

public class Plus {
    int num1;
    int num2;
    int num3;

    public Plus(int num1, int num2, int num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;

        System.out.println(plus(num1,num2,num3));
    }

    public Plus(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;

        System.out.println(plus(num1,num2));

    }

    public int plus(int num1, int num2){
        return num1 + num2;
    }

    public int plus(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
}
