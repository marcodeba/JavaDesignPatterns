package proxy.mybatisSample;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Proxy;

public class MybatisFactory {
    public static Object getMapper(Class clazz) {
        generateSourceCode(clazz);
        // Proxy这个类的作用就是用来动态创建一个代理对象的类
        return Proxy.newProxyInstance(clazz.getClassLoader(), new Class[]{clazz}, new MybatisHandler());
    }

    public static void generateSourceCode(Class clazz) {
        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{clazz});
        FileOutputStream fos = null;
        try {
            String filePath = clazz.getResource("").getPath();
            fos = new FileOutputStream(filePath + "/$Proxy0.class");
            fos.write(bytes);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
