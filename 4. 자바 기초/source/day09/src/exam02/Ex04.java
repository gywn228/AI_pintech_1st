package exam02;

public class Ex04 {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer(100);
        /*
        StringBuffer sb2 = sb.append("ABC");
        StringBuffer sb3 = sb2.append("DEF");
        StringBuffer sb4 = sb3.append("GHI");
        String str = sb4.toString();
        System.out.println(str); // ABCDEFGHI
        
         */
        // 메서드 체이닝 : 메소드를 체인처럼 연결한것
        String str = sb.append("ABC").append("DEF").append("GHI").toString(); 
        System.out.println(str); // ABCDEFGHI
        //System.out.println(sb == sb4); // true
    }
}
