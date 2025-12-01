package adapter;

public class Main {
    public static void main(String[] args) {
        USSocket usSocket = new AmericanSocket();
        EUPlug shaver = new Shaver();
        USSocket adapter = new EUPlug2USSocket(shaver);
        usSocket.provide();
        adapter.provide();


    }
}
