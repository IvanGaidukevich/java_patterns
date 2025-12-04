package strategy;

public class Main {
    public static void main(String[] args) {
        MoveStrategy left = new MoveLeft();
        MoveStrategy right = new MoveRight();
        MoveStrategy forward = new MoveForward();
        Move move = new Move();
        move.setStrategy(forward);
        move.makeMove();


    }
}
