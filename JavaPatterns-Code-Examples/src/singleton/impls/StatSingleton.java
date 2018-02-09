package singleton.impls;

/*
    That uses class loader for initialization
 */

public class StatSingleton {
    private static StatSingleton instance = new StatSingleton();

    private StatSingleton() {}

    public static StatSingleton getInstance() {
        return instance;
    }

    public String toString() {
        return "I'm a Stat Singleton!";
    }
}
