package strategy;

public class MoveRight implements MoveStrategy{
    @Override
    public void move() {
        System.out.println("Пошел направо и сам погиб, и коня потерял");
    }
}
