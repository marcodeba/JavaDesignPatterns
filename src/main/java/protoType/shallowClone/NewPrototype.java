package protoType.shallowClone;

/**
 * Created by marcopan on 17/10/20.
 * 浅克隆：对值类型的成员变量进行值的复制,对引用类型的成员变量只复制引用,不复制引用的对象.
 * 深克隆：对值类型的成员变量进行值的复制,对引用类型的成员变量也进行引用对象的复制.
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

        NewPrototype copyObj = (NewPrototype) newObj.clone();
        copyObj.setId("testCopy");
        copyObj.getPrototype().setName("changed object");

        System.out.println("original object id:" + newObj.getId());
        System.out.println("original object name:" + newObj.getPrototype().getName());

        System.out.println("cloned object id:" + copyObj.getId());
        System.out.println("cloned object name:" + copyObj.getPrototype().getName());
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
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}

