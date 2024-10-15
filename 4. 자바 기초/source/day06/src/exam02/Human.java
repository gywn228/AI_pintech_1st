package exam02;

public class Human extends Animal {
    @Override
    public void move() {
        System.out.println("두 발로 직립보행!");
    }
    public void reading(){
        System.out.println("독서를 한다");
    }
    
    /*public void move(){
        @Override
        super.move(); // Animal의 move();

        System.out.println("두 발로 직립보행!");
    }*/
}
