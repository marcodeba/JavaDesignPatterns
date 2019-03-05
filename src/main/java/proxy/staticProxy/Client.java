package proxy.staticProxy;

public class Client {

    public static void main(String[] args) {
        IAbstractSubject proxySubject = new StaticProxySubject(new RealSubject());
        proxySubject.rentHouse();
    }
}
