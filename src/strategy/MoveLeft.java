package strategy;

public class MoveLeft implements MoveStrategy{
    @Override
    public void move() {
        System.out.println("Пошел налево - сам погиб");
    }
}
