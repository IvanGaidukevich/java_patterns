package observer;

public class Main {
    public static void main(String[] args) {
        YoutubeChannel yc = new YoutubeChannel();
        Subscriber alan = new User("Alan");
        Subscriber ivan = new User("Ivan");
        Subscriber boris = new User("Boris");
        yc.subscribe(alan);
        yc.subscribe(ivan);
        yc.upload(" Гайд как писать быстро на Java");
        yc.subscribe(boris);
        yc.upload(" Паттерны проектирования Java");







    }
}
