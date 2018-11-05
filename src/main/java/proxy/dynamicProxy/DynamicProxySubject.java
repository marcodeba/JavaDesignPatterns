package proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by marcopan on 2018/9/8.
 * 动态代理类实现InvocationHandler接口，并提供构造函数，注入被代理对象
 */
public class DynamicProxySubject implements InvocationHandler {
    private IAbstractSubject target = null;

    public DynamicProxySubject(IAbstractSubject target) {
        this.target = target;
    }

    @Override
    /**
     * proxy:指被代理的对象,$Proxy0是系统自动生成的实现IAbstractSubject接口的代理类，并持有InvocationHandler引用
     * method:指代的是我们所要调用真实对象的某个方法的Method对象
     * args:指代的是调用真实对象某个方法时接受的参数
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method);
        method.invoke(target, args);
        return null;
    }
}
