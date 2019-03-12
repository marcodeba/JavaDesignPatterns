package builder.builder;

import builder.model.BMWModel;
import builder.model.CarModel;

import java.util.List;

/**
 * Created by marcopan on 17/10/23.
 */
public class BMWBuilder implements CarBuilder {
    private CarModel bmw = new BMWModel();

    public void setSequence(List<String> sequence) {
        this.bmw.setSequence(sequence);
    }

    public CarModel getCarModel() {
        return this.bmw;
    }
}
