package factorymode.factoryMethodmode.creator;

import factorymode.factoryMethodmode.car.AbstractCar;
import factorymode.factoryMethodmode.car.Benz;

public class BenzFactory implements CarFactory {

    public AbstractCar createCar() {
        return new Benz();
    }
}
