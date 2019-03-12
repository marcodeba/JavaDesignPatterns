package proxy.staticProxy;

/**
 * 代理角色，中介，含有真实角色的引用
 *
 * @author marcopan
 * 代理角色做两件事：
 * 1. 关联真实角色对象
 * 2. 调用真实对象方法
 */
public class StaticProxySubject implements IAbstractSubject {
    // 含有真实角色的引用
    private RealSubject realSubject = null;

    public StaticProxySubject(RealSubject subject) {
        this.realSubject = subject;
    }

    public void rentHouse() {
        //this.preRequest();
        realSubject.rentHouse();
        //this.postRequest();
    }

//	private void preRequest() {
//		System.out.println("preRequest from StaticProxySubject");
//	}
//	
//	private void postRequest() {
//		System.out.println("postRequest from StaticProxySubject");
//	}
}
