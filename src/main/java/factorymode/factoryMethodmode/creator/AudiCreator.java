package factorymode.factoryMethodmode.creator;

import factorymode.factoryMethodmode.car.AbstractCar;
import factorymode.factoryMethodmode.car.Audi;

public class AudiCreator implements CarFactory {
	
	@Override
	public AbstractCar createCar() {
		return new Audi();
	}
}
