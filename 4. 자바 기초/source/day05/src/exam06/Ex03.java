package exam06;

public class Ex03 {
    public static void main(String[] args) {
        try {
            String str = "abc";
            System.out.println(str.toUpperCase()); //NullPointerException

            int num1 = 10;
            int num2 = 0;
            int result = num1 / num2; // ArithmeticException
            System.out.println(result);
        } catch (Exception e){ // 처리가 같을때
            System.out.println(e.getMessage());
        }
            /* }catch (NullPointerException | ArithmeticException e){
            System.out.println(e.getMessage());
        }

        /*} catch (NullPointerException e){
            System.out.println(e.getMessage());//Cannot invoke "String.toUpperCase()" because "str" is null
            System.out.println("1번");
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("2번");*/
        //}
        System.out.println("실행 완료!");
    }
}
