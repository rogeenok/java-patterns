package singleton.impls;

/*
    That can use too much resources for synchronizing
 */

public class SynchronizedSingleton {
    private static SynchronizedSingleton instance;

    private SynchronizedSingleton() {}

    public static synchronized SynchronizedSingleton getInstance() {
        if (instance == null)
            instance = new SynchronizedSingleton();
        return instance;
    }

    public String toString() {
        return "I'm a Synchronized Singleton!";
    }
}
