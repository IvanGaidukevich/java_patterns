package state;

public class Unlocked implements TurnstileState{


    @Override
    public void insertCoin(Turnstile t) {
        System.out.println("Проход уже открыт");
    }

    @Override
    public void push(Turnstile t) {
        System.out.println("Проход выполнен - турникет закрыт");
        t.setState(new Locked());
    }
}
