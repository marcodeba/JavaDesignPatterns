package factorymode.simpleFactorymode;

public class Client {

	public static void main(String[] args) {
		AbstractCar car = Creator.getProduct("Benz");
		car.createCar();
	}
}
