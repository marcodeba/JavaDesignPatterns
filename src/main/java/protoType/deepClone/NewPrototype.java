package protoType.deepClone;

/**
 * Created by marcopan on 17/10/20.
 */
public class NewPrototype implements Cloneable {
    private String id;
    private Prototype prototype;

    public static void main(String[] args) {
        Prototype pro = new Prototype();
        pro.setName("original object");

        NewPrototype newObj = new NewPrototype();
        newObj.setId("test1");
        newObj.setPrototype(pro);

        NewPrototype clonObj = (NewPrototype) newObj.clone();
        clonObj.setId("testClone");
        clonObj.getPrototype().setName("changed object");

        System.out.println("original object id:" + newObj.getId());
        System.out.println("original object name:" + newObj.getPrototype().getName());

        System.out.println("cloned object id:" + clonObj.getId());
        System.out.println("cloned object name:" + clonObj.getPrototype().getName());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Prototype getPrototype() {
        return prototype;
    }

    public void setPrototype(Prototype prototype) {
        this.prototype = prototype;
    }

    public Object clone() {
        try {
            NewPrototype ret = (NewPrototype) super.clone();
            ret.prototype = (Prototype) this.prototype.clone();
            return ret;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
