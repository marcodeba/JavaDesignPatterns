package builder.builder;

import builder.model.CarModel;

import java.util.List;

/**
 * Created by marcopan on 17/10/23.
 */
public interface CarBuilder {
    public abstract void setSequence(List<String> sequence);
    //设置完毕顺序后，就可以直接拿到这个车辆模型了
    public abstract CarModel getCarModel();
}
