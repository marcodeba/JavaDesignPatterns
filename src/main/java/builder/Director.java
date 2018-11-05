package builder;

import builder.builder.BMWBuilder;
import builder.builder.BenzBuilder;
import builder.builder.CarBuilder;
import builder.model.CarModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marcopan on 17/10/23.
 */
public class Director {
    private List<String> sequence = new ArrayList<String>();
    private CarBuilder benzBuilder = new BenzBuilder();
    private CarBuilder bmwBuilder = new BMWBuilder();

    //A顺序的奔驰车
    public CarModel getABenzModel() {
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(sequence);
        return this.benzBuilder.getCarModel();
    }

    //B顺序的奔驰车
    public CarModel getBBenzModel() {
        this.sequence.clear();
        this.sequence.add("engine boom");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(sequence);
        return this.benzBuilder.getCarModel();
    }

    //C顺序的宝马车
    public CarModel getCBMWModel() {
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("alarm");
        this.sequence.add("stop");
        this.bmwBuilder.setSequence(sequence);
        return this.bmwBuilder.getCarModel();
    }

    //D顺序的宝马车
    public CarModel getDBMWModel() {
        this.sequence.clear();
        this.sequence.add("engine boom");
        this.sequence.add("start");
        this.bmwBuilder.setSequence(sequence);
        return this.bmwBuilder.getCarModel();
    }
}
