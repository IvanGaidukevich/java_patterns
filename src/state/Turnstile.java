package state;

public class Turnstile {
    private TurnstileState state = new Locked();

    public void setState(TurnstileState state) {
        this.state = state;
    }

    public void insertCoin() {
        state.insertCoin(this);
    }

    public void push() {
        state.push(this);
    }
}
