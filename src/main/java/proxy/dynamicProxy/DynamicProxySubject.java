package proxy.dynamicProxy;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by marcopan on 2018/9/8.
 * 动态代理类实现InvocationHandler接口，并提供构造函数，注入被代理对象
 */
public class DynamicProxySubject implements InvocationHandler {
    private IAbstractSubject target = null;

    public Object getProxyInstance(IAbstractSubject target) {
        this.target = target;
        Class<?> clazz = target.getClass();

//        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{IAbstractSubject.class});
//        try {
//            String filePath = IAbstractSubject.class.getResource("").getPath();
//            FileOutputStream fos = new FileOutputStream(filePath + "/$Proxy0.class");
//            fos.write(bytes);
//            fos.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        /**
         * Proxy这个类的作用就是用来动态创建一个代理对象的类
         * Proxy.newProxyInstance返回的是一个代理对象:com.sun.proxy.$Proxy0
         */
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    /**
     * proxy:指被代理的对象,$Proxy0是系统自动生成的实现IAbstractSubject接口的代理类，并持有InvocationHandler引用
     * method:指代的是我们所要调用真实对象的某个方法的Method对象
     * args:指代的是调用真实对象某个方法时接受的参数
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 增强消息......
        return method.invoke(target, args);
        // 增强消息......
    }
}
