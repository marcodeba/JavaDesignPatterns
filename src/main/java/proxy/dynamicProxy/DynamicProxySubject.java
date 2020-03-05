package proxy.dynamicProxy;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by marcopan on 2018/9/8.
 * 动态代理类实现InvocationHandler接口，并提供构造函数，注入被代理对象
 */
public class DynamicProxySubject implements InvocationHandler {
    private ISubject target;

    public DynamicProxySubject(ISubject target) {
        this.target = target;
    }

    /**
     * 生成动态代理对象,Proxy.newProxyInstance返回的是一个代理对象:com.sun.proxy.$Proxy0
     * 该代理对象extends Proxy implements RealSubject
     */
    public Object getProxyInstance() {
        Class<?> clazz = target.getClass();

        // Proxy这个类的作用就是用来动态创建一个代理对象的类
        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{clazz});
        FileOutputStream fos = null;
        try {
            String filePath = target.getClass().getResource("").getPath();
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

        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    /**
     * proxy:就是getProxyInstance生成的代理对象:com.sun.proxy.$Proxy0
     * method:指代的是我们所要调用真实对象的某个方法的Method对象
     * args:指代的是调用真实对象某个方法时接受的参数
     *
     * public final void requestHouse1() throws  {
     *     try {
     *         super.h.invoke(this, m3, (Object[])null);
     *     } catch (RuntimeException | Error var2) {
     *         throw var2;
     *     } catch (Throwable var3) {
     *         throw new UndeclaredThrowableException(var3);
     *     }
     * }
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 增强消息......
        return method.invoke(target, args);
        // 增强消息......
    }
}
