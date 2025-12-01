package bridge;

public class Main {
    public static void main(String[] args) {
        Device tv = new TV();
        Device ac = new AirConditioner();
        RemoteControl myRC = new MyRC(tv);
        myRC.togglePower();
        myRC.togglePower();
        myRC.setDevice(ac);
        myRC.togglePower();
        myRC.togglePower();
    }
}
