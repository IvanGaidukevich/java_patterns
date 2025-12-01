package singleton;

public class SimpleSingleton {
    protected static SimpleSingleton instance;

    protected SimpleSingleton(){

    }

    public static SimpleSingleton getInstance(){
        if (instance == null) {
            instance = new SimpleSingleton();
        }
        return instance;
    }
}
