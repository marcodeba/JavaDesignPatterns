package proxy.dynamicProxy;

/**
 * Created by marcopan on 2018/9/8.
 */
public class Client {
    public static void main(String[] args) {
        ISubject target = new RealSubject();
        ISubject proxyInstance = (ISubject) new DynamicProxySubject(target).getProxyInstance();
        proxyInstance.requestHouse1();
        proxyInstance.requestHouse2();
    }
}
