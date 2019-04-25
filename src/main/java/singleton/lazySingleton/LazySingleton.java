package singleton.lazySingleton;

import java.io.*;

/**
 * Created by marcopan on 2018/9/14.
 * 有反射攻击和序列化攻击的问题
 * <p>
 * 反射攻击解决方法：在构造函数中判断单例是否为空
 * 序列化攻击解决方法：重写readResolve()方法
 */
public class LazySingleton implements Serializable {
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
            LazySingleton instance1 = LazySingleton.getInstance();

            FileOutputStream fos = new FileOutputStream("EnumSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(instance1);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("EnumSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            // readObject返回了一个新的对象实例
            LazySingleton instance2 = (LazySingleton) ois.readObject();
            ois.close();

            System.out.println(instance1 == instance2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public static void main(String[] args) {
//        try {
//            //很无聊的情况下，进行破坏
//            Class<?> clazz = LazySingleton.class;
//            //通过反射拿到私有的构造方法
//            Constructor c = clazz.getDeclaredConstructor(null);
//            //强制访问，强吻，不愿意也要吻
//            c.setAccessible(true);
//
//            //暴力初始化
//            Object o1 = c.newInstance();
//            //调用了两次构造方法，相当于new了两次,犯了原则性问题，
//            Object o2 = LazySingleton.getInstance();//c.newInstance();
//
//            System.out.println(o1 == o2);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    // 解决序列化攻击的问题
    private Object readResolve() {
        return LazySingletonHolder.singleton;
    }

    private static class LazySingletonHolder {
        private static final LazySingleton singleton = new LazySingleton();
    }
}
