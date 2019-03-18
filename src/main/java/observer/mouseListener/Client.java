package observer.mouseListener;

/**
 * Created by marcopan on 2018/9/12.
 */
public class Client {
    public static void main(String[] args) {
        ICat cat = new BlackCat("黑猫");
        IMouse micky1 = new MickyMouse("micky1");
        IMouse micky2 = new MickyMouse("micky2");
        IMouse micky3 = new MickyMouse("micky3");

        cat.registerSubscriber(micky1);
        cat.registerSubscriber(micky2);
        cat.registerSubscriber(micky3);

        cat.catchMouse();
    }
}
