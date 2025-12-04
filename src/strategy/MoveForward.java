package strategy;

public class MoveForward implements MoveStrategy{
    @Override
    public void move() {
        System.out.println("Пошел прямо - коня потерял");
    }
}
