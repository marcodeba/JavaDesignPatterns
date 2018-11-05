package protoType.serilizationClone;

import java.io.Serializable;

/**
 * Created by marcopan on 17/10/20.
 */
public class PrototypeSerilization implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
