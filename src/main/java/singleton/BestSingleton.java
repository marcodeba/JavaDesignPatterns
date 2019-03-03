package singleton;

public class BestSingleton {

    // 私有构造函数
    private BestSingleton() {

    }

    public static BestSingleton getInstance() {
        return Singleton.INSTANCE.getInstance();
    }

    private enum Singleton {
        INSTANCE;

        private BestSingleton singleton;

        // JVM保证这个方法绝对只调用一次
        Singleton() {
            singleton = new BestSingleton();
        }

        public BestSingleton getInstance() {
            return singleton;
        }
    }
}
