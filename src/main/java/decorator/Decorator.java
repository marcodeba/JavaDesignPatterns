package decorator;

public class Decorator implements BoardHandler {
    BoardHandler handler;

    public Decorator(BoardHandler handler) {
        this.handler = handler;
    }

    @Override
    public String hangUp(String name) {
        return handler.hangUp(name);
    }
}
