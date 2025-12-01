package bridge;

public class AirConditioner implements Device{

    private boolean enabled = false;

    @Override
    public void powerOn() {
        enabled = true;
        System.out.println("Кондиционер включен");
    }

    @Override
    public void powerOff() {
        enabled = false;
        System.out.println("Кондиционер выключен");
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }
}
