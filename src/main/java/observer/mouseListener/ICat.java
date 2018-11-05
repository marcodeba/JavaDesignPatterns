package observer.mouseListener;

/**
 * Created by marcopan on 2018/9/11.
 */
public interface ICat {
    // 添加订阅者
    public void registerSubscriber(IMouse mouse);

    // 取消订阅
    public void removeSubscriber(IMouse mouse);

    // 抓老鼠
    public void catchMouse();
}
