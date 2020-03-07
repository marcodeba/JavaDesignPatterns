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
    public Object createProxyInstance() {
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
     * proxy:就是createProxyInstance生成的代理对象:com.sun.proxy.$Proxy0
     * method:指代的是我们所要调用真实对象的某个方法的Method对象
     * args:指代的是调用真实对象某个方法时接受的参数
     * <p>
     * public final void requestHouse1() throws  {
     * try {
     * super.h.invoke(this, m3, (Object[])null);
     * } catch (RuntimeException | Error var2) {
     * throw var2;
     * } catch (Throwable var3) {
     * throw new UndeclaredThrowableException(var3);
     * }
     * }
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 增强消息......
        return method.invoke(target, args);
        // 增强消息......
    }
}

/**
 * public final class $Proxy0 extends Proxy implements RealSubject {
 * private static Method m1;
 * private static Method m9;
 * private static Method m2;
 * private static Method m3;
 * private static Method m6;
 * private static Method m4;
 * private static Method m5;
 * private static Method m8;
 * private static Method m10;
 * private static Method m0;
 * private static Method m7;
 * <p>
 * public $Proxy0(InvocationHandler var1) throws  {
 * super(var1);
 * }
 * <p>
 * public final boolean equals(Object var1) throws  {
 * try {
 * return (Boolean)super.h.invoke(this, m1, new Object[]{var1});
 * } catch (RuntimeException | Error var3) {
 * throw var3;
 * } catch (Throwable var4) {
 * throw new UndeclaredThrowableException(var4);
 * }
 * }
 * <p>
 * public final void notify() throws  {
 * try {
 * super.h.invoke(this, m9, (Object[])null);
 * } catch (RuntimeException | Error var2) {
 * throw var2;
 * } catch (Throwable var3) {
 * throw new UndeclaredThrowableException(var3);
 * }
 * }
 * <p>
 * public final String toString() throws  {
 * try {
 * return (String)super.h.invoke(this, m2, (Object[])null);
 * } catch (RuntimeException | Error var2) {
 * throw var2;
 * } catch (Throwable var3) {
 * throw new UndeclaredThrowableException(var3);
 * }
 * }
 * <p>
 * public final void requestHouse1() throws  {
 * try {
 * super.h.invoke(this, m3, (Object[])null);
 * } catch (RuntimeException | Error var2) {
 * throw var2;
 * } catch (Throwable var3) {
 * throw new UndeclaredThrowableException(var3);
 * }
 * }
 * <p>
 * public final void wait(long var1) throws InterruptedException {
 * try {
 * super.h.invoke(this, m6, new Object[]{var1});
 * } catch (RuntimeException | InterruptedException | Error var4) {
 * throw var4;
 * } catch (Throwable var5) {
 * throw new UndeclaredThrowableException(var5);
 * }
 * }
 * <p>
 * public final void requestHouse2() throws  {
 * try {
 * super.h.invoke(this, m4, (Object[])null);
 * } catch (RuntimeException | Error var2) {
 * throw var2;
 * } catch (Throwable var3) {
 * throw new UndeclaredThrowableException(var3);
 * }
 * }
 * <p>
 * public final void wait(long var1, int var3) throws InterruptedException {
 * try {
 * super.h.invoke(this, m5, new Object[]{var1, var3});
 * } catch (RuntimeException | InterruptedException | Error var5) {
 * throw var5;
 * } catch (Throwable var6) {
 * throw new UndeclaredThrowableException(var6);
 * }
 * }
 * <p>
 * public final Class getClass() throws  {
 * try {
 * return (Class)super.h.invoke(this, m8, (Object[])null);
 * } catch (RuntimeException | Error var2) {
 * throw var2;
 * } catch (Throwable var3) {
 * throw new UndeclaredThrowableException(var3);
 * }
 * }
 * <p>
 * public final void notifyAll() throws  {
 * try {
 * super.h.invoke(this, m10, (Object[])null);
 * } catch (RuntimeException | Error var2) {
 * throw var2;
 * } catch (Throwable var3) {
 * throw new UndeclaredThrowableException(var3);
 * }
 * }
 * <p>
 * public final int hashCode() throws  {
 * try {
 * return (Integer)super.h.invoke(this, m0, (Object[])null);
 * } catch (RuntimeException | Error var2) {
 * throw var2;
 * } catch (Throwable var3) {
 * throw new UndeclaredThrowableException(var3);
 * }
 * }
 * <p>
 * public final void wait() throws InterruptedException {
 * try {
 * super.h.invoke(this, m7, (Object[])null);
 * } catch (RuntimeException | InterruptedException | Error var2) {
 * throw var2;
 * } catch (Throwable var3) {
 * throw new UndeclaredThrowableException(var3);
 * }
 * }
 * <p>
 * static {
 * try {
 * m1 = Class.forName("java.lang.Object").getMethod("equals", Class.forName("java.lang.Object"));
 * m9 = Class.forName("proxy.dynamicProxy.RealSubject").getMethod("notify");
 * m2 = Class.forName("java.lang.Object").getMethod("toString");
 * m3 = Class.forName("proxy.dynamicProxy.RealSubject").getMethod("requestHouse1");
 * m6 = Class.forName("proxy.dynamicProxy.RealSubject").getMethod("wait", Long.TYPE);
 * m4 = Class.forName("proxy.dynamicProxy.RealSubject").getMethod("requestHouse2");
 * m5 = Class.forName("proxy.dynamicProxy.RealSubject").getMethod("wait", Long.TYPE, Integer.TYPE);
 * m8 = Class.forName("proxy.dynamicProxy.RealSubject").getMethod("getClass");
 * m10 = Class.forName("proxy.dynamicProxy.RealSubject").getMethod("notifyAll");
 * m0 = Class.forName("java.lang.Object").getMethod("hashCode");
 * m7 = Class.forName("proxy.dynamicProxy.RealSubject").getMethod("wait");
 * } catch (NoSuchMethodException var2) {
 * throw new NoSuchMethodError(var2.getMessage());
 * } catch (ClassNotFoundException var3) {
 * throw new NoClassDefFoundError(var3.getMessage());
 * }
 * }
 * }
 */