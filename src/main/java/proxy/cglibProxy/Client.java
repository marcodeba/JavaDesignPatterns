package proxy.cglibProxy;



public class Client {
    public static void main(String[] args) throws Exception {
        ISubject target = new RealSubject();
        ISubject cglibInstance = (ISubject) new CglibProxySubject().getCglibInstance(target.getClass());
        cglibInstance.requestHouse1();
        cglibInstance.requestHouse2();
    }
}
