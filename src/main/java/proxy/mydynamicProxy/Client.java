package proxy.mydynamicProxy;

/**
 * Created by marcopan on 2018/9/8.
 */
public class Client {
    public static void main(String[] args) {
        IAbstractSubject iSubject = new RealSubject();
        GPInvocationHandler handler = new DynamicProxySubject(iSubject);

        /**
         * Proxy这个类的作用就是用来动态创建一个代理对象的类
         * Proxy.newProxyInstance返回的是一个代理对象:com.sun.proxy.$Proxy0
         * 根据handler.getClass().getClassLoader()和iSubject.getClass().
         　　　　　　getInterfaces()构造Class对象，Class对象的构造函数入参是handler
         */
        IAbstractSubject proxySubject = (IAbstractSubject) GPProxy.newProxyInstance(new GPClassLoader(),
                iSubject.getClass().getInterfaces(),
                handler);
        System.out.println(proxySubject.getClass().getName());
        //调用的是super.h.invoke(this, , )，DynamicProxySubject的invoke方法
        proxySubject.requestHouse1();
        proxySubject.requestHouse2();
    }
}
