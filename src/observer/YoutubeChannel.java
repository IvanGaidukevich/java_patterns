package observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel {
    private List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber subscriber){
        subscribers.add(subscriber);
        System.out.println(subscriber.getName() + " подписался на канал");
    }

    public void upload(String title){
        System.out.println("Загружено новое видео" + title);
        for (Subscriber s:subscribers){
            s.update(title);
        }
    }

}
