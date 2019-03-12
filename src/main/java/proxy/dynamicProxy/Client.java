package proxy.dynamicProxy;

/**
 * Created by marcopan on 2018/9/8.
 */
public class Client {
    public static void main(String[] args) {
        ISubject target = new RealSubject();
        ISubject dynamicInstance = (ISubject) new DynamicProxySubject(target).getProxyInstance();
        dynamicInstance.requestHouse1();
        dynamicInstance.requestHouse2();
    }
}
