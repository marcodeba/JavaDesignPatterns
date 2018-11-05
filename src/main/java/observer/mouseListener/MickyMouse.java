package observer.mouseListener;

/**
 * Created by marcopan on 2018/9/12.
 */
public class MickyMouse implements IMouse {
    private String name;

    public MickyMouse(String name) {
        this.name = name;
    }

    @Override
    public void runAway() {
        System.out.println(name + " run away");
    }
}
