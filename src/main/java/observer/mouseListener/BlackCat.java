package observer.mouseListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marcopan on 2018/9/12.
 */
public class BlackCat implements ICat {

    String name;

    public BlackCat(String name) {
        this.name = name;
    }

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
        System.out.println(this.name + " is coming!!!");
        for (IMouse mouse : mouseList) {
            mouse.runAway();
        }
    }
}
