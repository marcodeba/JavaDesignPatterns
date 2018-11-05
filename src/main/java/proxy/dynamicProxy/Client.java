package proxy.dynamicProxy;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by marcopan on 2018/9/8.
 */
public class Client {
    public static void main(String[] args) {
        IAbstractSubject iSubject = new RealSubject();
        InvocationHandler handler = new DynamicProxySubject(iSubject);

        /**
         * Proxy这个类的作用就是用来动态创建一个代理对象的类
         * Proxy.newProxyInstance返回的是一个代理对象:com.sun.proxy.$Proxy0
         * 根据handler.getClass().getClassLoader()和iSubject.getClass().
         　　　　　　getInterfaces()构造Class对象，Class对象的构造函数入参是handler
         */
        IAbstractSubject proxy = (IAbstractSubject) Proxy.newProxyInstance(handler.getClass().getClassLoader(),
                iSubject.getClass().getInterfaces(),
                handler);
        //System.out.println(proxy.getClass().getName());
        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{IAbstractSubject.class});
        try {
            String filePath = IAbstractSubject.class.getResource("").getPath();
            FileOutputStream fos = new FileOutputStream( filePath + "/$Proxy0.class");
            fos.write(bytes);
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //调用的是super.h.invoke(this, , )，DynamicProxySubject的invoke方法
        proxy.requestHouse1();
        proxy.requestHouse2();
    }
}
