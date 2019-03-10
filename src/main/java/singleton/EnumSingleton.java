package singleton;

public enum EnumSingleton {

    INSTANCE;
    Object obj = null;

    EnumSingleton () {
        obj = new Object();
    }

    public Object getInstance() {
        return obj;
    }

    public static void main(String[] args) {
        Object instance = EnumSingleton.INSTANCE.getInstance();
    }
}
