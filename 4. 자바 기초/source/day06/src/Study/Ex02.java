package Study;

public class Ex02 {
    public static void main(String[] args) {
        Print print = new Print("겨울","붕어빵");
        print.seasonFood();

        print.season = "봄";
        print.food = "미나리무침";
        print.seasonFood();

        print.season = "여름";
        print.food = "수박";
        print.seasonFood();

        print.season = "가을";
        print.food = "밤";
        print.seasonFood();
    }
}
