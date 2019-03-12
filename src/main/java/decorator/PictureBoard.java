package decorator;

// Concrete Component
public class PictureBoard implements BoardHandler {

    @Override
    public String hangUp(String name) {
        return name + " hangUp";
    }
}
