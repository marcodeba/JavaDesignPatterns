package builder.builder;

import builder.model.BenzModel;
import builder.model.CarModel;

import java.util.List;

/**
 * Created by marcopan on 17/10/23.
 */
public class BenzBuilder implements CarBuilder {
    private CarModel benz = new BenzModel(); //奔驰车模型

    public void setSequence(List<String> sequence) {
        this.benz.setSequence(sequence);
    }

    public CarModel getCarModel() {
        return this.benz;
    }
}
