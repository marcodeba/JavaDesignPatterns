package singleton.lazySingleton;

/**
 * Created by marcopan on 2018/9/14.
 */
public class LazySingleton {
    private LazySingleton() {
        // 防止通过反射来破坏单例
        if (LazySingleHolder.singleton != null) {
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    public static final LazySingleton getInstance() {
        return LazySingleHolder.singleton;
    }

    private static class LazySingleHolder {
        private static final LazySingleton singleton = new LazySingleton();
    }
}
