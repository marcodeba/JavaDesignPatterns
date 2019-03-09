package singleton.lazySingleton;

/**
 * Created by marcopan on 2018/9/14.
 */
public class LazySingleton {
    private LazySingleton() {
    }

    public static final LazySingleton getInstance() {
        return LazySingleHolder.singleton;
    }

    private static class LazySingleHolder {
        private static final LazySingleton singleton = new LazySingleton();
    }
}
