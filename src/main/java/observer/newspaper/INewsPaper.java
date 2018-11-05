package observer.newspaper;

// 报纸接口（被观察者,Observable）
public interface INewsPaper {
	// 添加订阅者
	public void registerSubscriber(ISubScribe subScribe);
	
	// 取消订阅
	public void removeSubscriber(ISubScribe subScribe);
	
	// 发送报纸
	public void sendPaper();
}
