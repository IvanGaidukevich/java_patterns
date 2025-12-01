package adapter;

public class Shaver implements EUPlug{
    @Override
    public void plugIn() {
        System.out.println("Бритва работает от 220в");
    }
}
