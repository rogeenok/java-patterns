package singleton.impls;

/*
    That's not THREAD SAFE implementation!!
 */

public class ClassicSingleton {
    private static ClassicSingleton instance;

    private ClassicSingleton() {}

    public static ClassicSingleton getInstance() {
        if (instance == null)
            instance = new ClassicSingleton();
        return instance;
    }

    public String toString() {
        return "I'm a Classic Singleton!";
    }
}
