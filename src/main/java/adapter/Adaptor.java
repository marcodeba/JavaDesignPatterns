package adapter;

/**
 * Created by marcopan on 17/9/23.
 */
public class Adaptor implements Target {
    Adaptee adaptee;

    public Adaptor(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void sampleOperation1() {
        adaptee.sampleOperation1();
    }

    @Override
    public void sampleOperation2() {
        System.out.println("Adaptor sampleOperation2");
    }
}
