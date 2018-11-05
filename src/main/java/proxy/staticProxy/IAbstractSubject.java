package proxy.staticProxy;

/**
 * 抽象角色，真实角色和代理角色都要实现的接口
 * @author marcopan
 */
public interface IAbstractSubject {

	// 代理对象和真实角色共有的方法，租房()
	public void rentHouse();
}
