package observer.newspaper;

// 订阅者(观察者,Observer)
public interface ISubScribe {
    // 有新的报纸了就会被执行通知
    public void getNewsPaper();
}
