package protoType.serilizationClone;

import java.io.*;

/**
 * Created by marcopan on 17/10/20.
 */
public class NewPrototypeSerilization implements Serializable {
    private String id;
    private PrototypeSerilization prototype;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PrototypeSerilization getPrototype() {
        return prototype;
    }

    public void setPrototype(PrototypeSerilization prototype) {
        this.prototype = prototype;
    }

    public Object deepClone(){
        try {
            ByteArrayOutputStream bo = new ByteArrayOutputStream();
            ObjectOutputStream oo = new ObjectOutputStream(bo);
            oo.writeObject(this);

            ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
            ObjectInputStream oi = new ObjectInputStream(bi);
            return oi.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        PrototypeSerilization po = new PrototypeSerilization();
        po.setName("test1");
        NewPrototypeSerilization se = new NewPrototypeSerilization();
        se.setPrototype(po);

        NewPrototypeSerilization deepClone = (NewPrototypeSerilization)se.deepClone();
        deepClone.getPrototype().setName("test2");

        System.out.println("original name:" + se.getPrototype().getName());
        System.out.println("cloned name:" + deepClone.getPrototype().getName());
    }
}
