package bridge;

public class TV implements Device{
    private boolean enabled = false;

    @Override
    public void powerOn() {
        enabled = true;
        System.out.println("TV включен");
    }

    @Override
    public void powerOff() {
        enabled = false;
        System.out.println("TV выключен");
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }
}
