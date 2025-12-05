package command;

public class Main {
    public static void main(String[] args) {
        Device tv = new TV();
        Device light = new Light();
        Remote remote = new Remote();
        remote.setCommand(new TurnOn(light));
        remote.setCommand(new TurnOff(light));
        remote.press();

    }
}
