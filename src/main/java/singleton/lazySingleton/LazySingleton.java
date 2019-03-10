package singleton.lazySingleton;

import java.lang.reflect.Constructor;

/**
 * Created by marcopan on 2018/9/14.
 * 有反射攻击和序列化攻击的问题
 */
public class LazySingleton {
    private LazySingleton() {
        // 防止通过反射来破坏单例
        if (LazySingletonHolder.singleton != null) {
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    public static final LazySingleton getInstance() {
        return LazySingletonHolder.singleton;
    }

    public static void main(String[] args) {
        try {
            //很无聊的情况下，进行破坏
            Class<?> clazz = LazySingleton.class;
            //通过反射拿到私有的构造方法
            Constructor c = clazz.getDeclaredConstructor(null);
            //强制访问，强吻，不愿意也要吻
            c.setAccessible(true);

            //暴力初始化
            Object o1 = c.newInstance();
            //调用了两次构造方法，相当于new了两次,犯了原则性问题，
            Object o2 = LazySingleton.getInstance();//c.newInstance();

            System.out.println(o1 == o2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static class LazySingletonHolder {
        private static final LazySingleton singleton = new LazySingleton();
    }
}
