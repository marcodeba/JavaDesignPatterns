package proxy.mydynamicProxy;

import java.lang.reflect.Method;

/**
 * Created by marcopan on 2018/9/8.
 */
public class DynamicProxySubject implements GPInvocationHandler {
    private IAbstractSubject realSubject = null;

    public DynamicProxySubject(IAbstractSubject realObject) {
        this.realSubject = realObject;
    }

    @Override
    /**
     * proxy:指代理对象,com.sun.proxy.$Proxy0
     * method:指代的是我们所要调用真实对象的某个方法的Method对象
     * args:指代的是调用真实对象某个方法时接受的参数
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        method.invoke(realSubject, args);
        return null;
    }
}
