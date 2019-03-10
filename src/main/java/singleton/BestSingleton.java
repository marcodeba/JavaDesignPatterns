package singleton;

public enum BestSingleton {

    INSTANCE;
    Object object;

    BestSingleton() {
        object = new Object();
    }

    public Object getInstance() {
        return object;
    }

    public static void main(String[] args) {
        Object instance = BestSingleton.INSTANCE.getInstance();
    }
}
