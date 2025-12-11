package chain;

public class BLHandler extends Handler{
    @Override
    protected boolean process(String request) {
        System.out.println("[EXEC] action is done");
        return true;
    }
}
