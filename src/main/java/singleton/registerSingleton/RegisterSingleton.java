package singleton.registerSingleton;

/**
 * Created by marcopan on 2018/9/14.
 */
public class RegisterSingleton {
    // volatile防止指令重排序
    private volatile static RegisterSingleton lazy = null;

    private RegisterSingleton() {
    }

    public static RegisterSingleton getInstance() {
        if (lazy == null) {
            synchronized (RegisterSingleton.class) {
                if (lazy == null) {
                    lazy = new RegisterSingleton();
                    //1.分配内存给这个对象
                    //2.初始化对象
                    //3.设置lazy指向刚分配的内存地址
                    //4.初次访问对象
                }
            }
        }
        return lazy;
    }
}
