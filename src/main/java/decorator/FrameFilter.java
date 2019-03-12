package decorator;

public class FrameFilter extends Decorator {

    public FrameFilter(BoardHandler handler) {
        super(handler);
    }

    public String hangUp(String content) {
        String temp = super.hangUp(content);
        temp += " add frame ";
        return temp;
    }
}
