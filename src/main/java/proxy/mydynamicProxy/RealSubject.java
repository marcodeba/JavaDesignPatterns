package proxy.mydynamicProxy;

/**
 * 真实角色--房东
 * @author marcopan
 */
public class RealSubject implements IAbstractSubject {
    @Override
    public void requestHouse1() {
        System.out.println("requestHouse1 from RealSubject");
    }

    @Override
    public void requestHouse2() {
        System.out.println("requestHouse2 from RealSubject");
    }
}
