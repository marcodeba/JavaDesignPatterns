package decorator.coffeestore.condiment;

import decorator.coffeestore.coffee.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}