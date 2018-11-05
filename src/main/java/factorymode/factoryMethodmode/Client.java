package factorymode.factoryMethodmode;

import factorymode.factoryMethodmode.car.*;
import factorymode.factoryMethodmode.creator.*;

public class Client {

	public static void main(String[] args) {
		CarFactory creator = new BenzFactory();
		
		AbstractCar car = creator.createCar();
		car.run();
		
		System.out.println(car.hashCode());
		System.out.println(car.hashCode());
		System.out.println(car.hashCode());
		
		try {
			Thread.sleep(1000);
			
			car.run();
			System.out.println(car.hashCode());
			System.out.println(car.hashCode());
			System.out.println(car.hashCode());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
