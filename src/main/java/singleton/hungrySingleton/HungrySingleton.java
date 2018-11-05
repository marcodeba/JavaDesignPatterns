package singleton.hungrySingleton;

/**
 * Created by marcopan on 2018/9/14.
 */
public class HungrySingleton {
    private static HungrySingleton singleton = new HungrySingleton();

    private HungrySingleton() {}

    public static HungrySingleton getInstance() {
        return singleton;
    }
}
