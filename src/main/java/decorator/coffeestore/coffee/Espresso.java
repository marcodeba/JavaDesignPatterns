package decorator.coffeestore.coffee;

public class Espresso extends Beverage {
    public Espresso() {
        description = "espresso";
    }

    public double cost() {
        return 1.99;
    }
}