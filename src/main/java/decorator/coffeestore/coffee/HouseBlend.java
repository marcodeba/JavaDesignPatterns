package decorator.coffeestore.coffee;

class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "houseblend";
    }

    public double cost() {
        return .89;
    }
}