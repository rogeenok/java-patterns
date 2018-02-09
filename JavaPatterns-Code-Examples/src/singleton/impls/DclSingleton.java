package singleton.impls;

/*
    That's really fast solution
 */

public class DclSingleton {
    private volatile static DclSingleton instance;

    private DclSingleton() {}

    public static DclSingleton getInstance() {
        if (instance == null) {
            synchronized (DclSingleton.class) {
                if (instance == null)
                    instance = new DclSingleton();
            }
        }
        return instance;
    }

    public String toString() {
        return "I'm a DCL Singleton!";
    }
}
