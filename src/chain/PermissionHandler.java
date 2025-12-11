package chain;

public class PermissionHandler extends Handler{
    @Override
    protected boolean process(String request) {
        if  (!request.contains("admin")){
            System.out.println("[PERMISSION] Not admin -> rejected");
            return false;
        }
        System.out.println("[PERMISSION] Permission ok");
        return true;
    }
}
