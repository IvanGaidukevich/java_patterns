package state;

public class Locked implements TurnstileState{
    @Override
    public void insertCoin(Turnstile t) {
        System.out.println("Монета принята - проход открыт");
        t.setState(new Unlocked());
    }

    @Override
    public void push(Turnstile t) {
        System.out.println("Турникет закрыт - вставьте монету");
    }
}
