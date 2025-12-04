package strategy;

public class Move {
    private MoveStrategy strategy;

    public void makeMove(){
        strategy.move();
    }

    public void setStrategy(MoveStrategy strategy) {
        this.strategy = strategy;
    }
}
