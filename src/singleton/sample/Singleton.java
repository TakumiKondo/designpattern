package singleton.sample;

public class Singleton {

    private static Singleton _instance = null;

    private Singleton() {}

    public synchronized static Singleton getInstatnce() {
        if(_instance == null) {
            _instance = new Singleton();
        }
        return _instance;
    }
}
