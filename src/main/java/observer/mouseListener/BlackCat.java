package observer.mouseListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marcopan on 2018/9/12.
 */
public class BlackCat implements ICat {

    List<IMouse> mouseList = new ArrayList<IMouse>();

    @Override
    public void registerSubscriber(IMouse mouse) {
        mouseList.add(mouse);
    }

    @Override
    public void removeSubscriber(IMouse mouse) {
        mouseList.remove(mouse);
    }

    @Override
    public void catchMouse() {
        System.out.println("cat is coming!!!");
        for (IMouse mouse : mouseList) {
            mouse.runAway();
        }
    }
}
