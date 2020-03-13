package proxy.mybatisSample;

import java.lang.reflect.Proxy;

public class MybatisFactory {
    public static Object getMapper(Class clazz) {
        Object proxyInstance = Proxy.newProxyInstance(clazz.getClassLoader(),
                new Class[]{clazz},
                new MybatisHandler());
        return proxyInstance;
    }
}
