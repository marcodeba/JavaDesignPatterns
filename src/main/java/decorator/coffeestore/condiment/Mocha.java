package decorator.coffeestore.condiment;

import decorator.coffeestore.coffee.Beverage;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ",mocha";
    }

    public double cost() {
        return beverage.cost() + .20;
    }
}