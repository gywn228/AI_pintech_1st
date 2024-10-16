package Study;

public class Print {
    String season;
    String food;

    public void seasonFood(){
        System.out.printf("%s에는 %s이 최고지!%n",season,food);
    }

    public Print(String season, String food){
        this.season = season;
        this.food = food;
    }
}
