package proxy.dynamicProxy;

/**
 * Created by marcopan on 2018/9/8.
 */
public class Client {
    public static void main(String[] args) {
        IAbstractSubject target = new RealSubject();

        IAbstractSubject proxy = (IAbstractSubject) new DynamicProxySubject(target).getProxyInstance();
        proxy.requestHouse1();
        proxy.requestHouse2();
    }
}
