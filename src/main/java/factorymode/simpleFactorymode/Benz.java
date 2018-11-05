package factorymode.simpleFactorymode;

public class Benz implements AbstractCar {

	@Override
	public void createCar() {
		System.out.println("create Benz");
	}

}
