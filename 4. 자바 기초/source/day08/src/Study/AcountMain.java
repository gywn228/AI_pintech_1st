package Study;

public class AcountMain {
    public static void main(String[] args) {
        Acount acount = new Acount();
        int a = acount.getKhjAcount() * 2;
        System.out.println(a);
        acount.setKhjAcount(500000);
        System.out.println(acount.getKhjAcount());

    }
}
