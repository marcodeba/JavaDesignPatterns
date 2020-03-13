package decorator.coffeestore;

import decorator.coffeestore.coffee.Beverage;
import decorator.coffeestore.coffee.Espresso;
import decorator.coffeestore.condiment.Mocha;
import decorator.coffeestore.condiment.Whip;

public class DecorateTest {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + ":" + beverage.cost());
        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription() + ":" + beverage.cost());
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription() + ":" + beverage.cost());
    }
}
