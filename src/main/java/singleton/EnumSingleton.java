package singleton;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public enum EnumSingleton {

    INSTANCE;
    private Object data;

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        try {
            EnumSingleton instance1 = EnumSingleton.getInstance();
            instance1.setData(new Object());

            FileInputStream fis = new FileInputStream("EnumSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            EnumSingleton instance2 = (EnumSingleton) ois.readObject();
            ois.close();

            System.out.println(instance1.getData());
            System.out.println(instance2.getData());
            System.out.println(instance1.getData() == instance2.getData());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
