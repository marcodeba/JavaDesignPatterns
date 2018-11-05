package adapter;

/**
 * Created by marcopan on 17/9/23.
 */
public class Client {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adaptor(adaptee);
        target.sampleOperation1();
        target.sampleOperation2();
    }
}
