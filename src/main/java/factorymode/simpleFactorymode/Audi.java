package factorymode.simpleFactorymode;

public class Audi implements AbstractCar {

	@Override
	public void createCar() {
		System.out.println("create Audi");
	}

}
