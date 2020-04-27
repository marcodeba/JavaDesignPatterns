package proxy.cglibProxy;


import net.sf.cglib.core.DebuggingClassWriter;

public class Client {
    public static void main(String[] args) {
        String filePath = ISubject.class.getResource("").getPath();
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, filePath);

        ISubject cglibInstance = (ISubject) new CglibProxySubject().getCglibInstance(new RealSubject().getClass());
        System.out.println(cglibInstance);
        cglibInstance.requestHouse1();
        cglibInstance.requestHouse2();
    }
}
