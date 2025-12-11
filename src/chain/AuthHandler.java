package chain;

public class AuthHandler extends Handler{

    @Override
    protected boolean process(String request) {
        if  (!request.contains("token")){
            System.out.println("[AUTH] no token -> rejected");
            return false;
        }
        System.out.println("[AUTH] Token ok");
        return true;
    }
}
