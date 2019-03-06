package factorymode.simpleFactorymode;

public class Creator {

    public static AbstractCar getProduct(String productName) {
        if ("Audi".equals(productName)) {
            return new Audi();
        } else {
            return new Benz();
        }
    }
}
