package exam03;

public class Q4 {
    public static void main(String[] args) {
        System.out.println(a("HAPPY"));
    }

    static String a(String x){
       String lower = x.toLowerCase();
       String upper = x.toUpperCase();
       if (x == lower){
           x = x.toUpperCase();
       } else if (x == upper) {
           x = x.toLowerCase();
       }
       return x;
    }
    }



