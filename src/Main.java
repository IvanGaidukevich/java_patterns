import singleton.GamePlayer;
import singleton.Player;
import singleton.SimpleSingleton;

public class Main {
    public static void main(String[] args) {
        SimpleSingleton singleton = SimpleSingleton.getInstance();
        System.out.println(singleton);
        System.out.println(SimpleSingleton.getInstance());
        System.out.println(SimpleSingleton.getInstance());
        System.out.println(singleton);

        Player.PLAYER1.info();
        Player.PLAYER1.setNickname("Vasia Pupkin");
        Player.PLAYER1.setScore(100);
        Player.PLAYER1.info();
        GamePlayer gp = GamePlayer.create("Ivan");
        System.out.println(gp);
        GamePlayer gp1 = GamePlayer.create("Ivan1");
        System.out.println(gp1);


    }


}
