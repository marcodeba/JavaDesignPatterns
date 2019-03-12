package proxy.dynamicProxy;

/**
 * Created by marcopan on 2018/9/8.
 */
public class RealSubject implements ISubject {
    public void requestHouse1() {
        System.out.println("requestHouse1 from RealSubject");
    }

    public void requestHouse2() {
        System.out.println("requestHouse2 from RealSubject");
    }
}
