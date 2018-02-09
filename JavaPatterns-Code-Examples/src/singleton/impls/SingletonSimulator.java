package singleton.impls;

public class SingletonSimulator {

    public static void main(String[] args) {
        ClassicSingleton classicSingleton = ClassicSingleton.getInstance();
        SynchronizedSingleton synchronizedSingleton = SynchronizedSingleton.getInstance();
        StatSingleton statSingleton = StatSingleton.getInstance();
        DclSingleton dclSingleton = DclSingleton.getInstance();

        System.out.println(classicSingleton);
        System.out.println(synchronizedSingleton);
        System.out.println(statSingleton);
        System.out.println(dclSingleton);
    }
}
