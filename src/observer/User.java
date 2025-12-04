package observer;

public class User implements Subscriber{
    public String username;

    public User(String username) {
        this.username = username;
    }

    @Override
    public String getName() {
        return username;
    }

    @Override
    public void update(String videoTitle) {
        System.out.println(username + " получил уведомление: новое видео - " + videoTitle);
    }
}
