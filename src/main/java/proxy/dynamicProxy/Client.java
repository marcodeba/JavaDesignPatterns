package proxy.dynamicProxy;

/**
 * Created by marcopan on 2018/9/8.
 */
public class Client {
    public static void main(String[] args) {
        IAbstractSubject iSubject = new RealSubject();

        IAbstractSubject proxy = (IAbstractSubject) new DynamicProxySubject().getProxyInstance(iSubject);
        proxy.requestHouse1();
        proxy.requestHouse2();
    }
}
