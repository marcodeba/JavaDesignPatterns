package proxy.staticProxy;

/**
 * �����ɫ���н飬������ʵ��ɫ������
 * @author marcopan
 * �����ɫ�������£�
 * 1. ������ʵ��ɫ����
 * 2. ������ʵ���󷽷�
 */
public class StaticProxySubject implements IAbstractSubject {
	// ������ʵ��ɫ������
	private RealSubject realSubject = null;

	public StaticProxySubject(RealSubject subject) {
		this.realSubject = subject;
	}

	@Override
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
