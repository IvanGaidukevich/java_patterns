package chain;

public class Main {
    public static void main(String[] args) {
        Handler chain = new LoggingHandler();
        chain.setNext(new AuthHandler())
                .setNext(new PermissionHandler())
                .setNext(new BLHandler());

        String request = "token; admin; some action";

        chain.handle(request);
    }
}
