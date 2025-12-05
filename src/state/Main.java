package state;

public class Main {
    public static void main(String[] args) {
        Turnstile turnstile = new Turnstile();
        turnstile.insertCoin();
        turnstile.push();
        turnstile.push();
    }

}
