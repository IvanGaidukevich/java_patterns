package adapter;

public class AmericanSocket implements USSocket{
    @Override
    public void provide() {
        System.out.println("Дает ток напряжением 110 вольт!");
    }
}
