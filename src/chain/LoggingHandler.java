package chain;

public class LoggingHandler extends Handler{
    @Override

    protected boolean process(String request) {
        System.out.println("[LOG] request recieved: " + request);
        return true;
    }
}
