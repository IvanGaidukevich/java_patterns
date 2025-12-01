package singleton;

public class GamePlayer {
    private static int count = 0;
    private final String name;
    private int score;

    private GamePlayer(String name){
        this.name = name;
        this.score = 0;
    }

    public static GamePlayer create(String name){
        if (count == 0){
            count ++;
            return new GamePlayer(name);
        }
        return null;
    }

}
