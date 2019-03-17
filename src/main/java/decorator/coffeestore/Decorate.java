package decorator.coffeestore;

import decorator.coffeestore.coffee.Beverage;
import decorator.coffeestore.coffee.Espresso;
import decorator.coffeestore.condiment.Mocha;
import decorator.coffeestore.condiment.Whip;

public class Decorate {
    public static void main(String[] args) {
        Beverage espresso1 = new Espresso();    //实例化一个espresso对象
        System.out.println(espresso1.getDescription() + ":" + espresso1.cost()); //输出只有espresso没有配料的描述与价格
        espresso1 = new Mocha(espresso1);    //用Mocha配料装饰espresso，装饰的过程即创建一个装饰者对象的过程，把被装饰者作为形参传递进去，结合该装饰者信息与装饰者信息结合，制造出一个装饰后的对象
        System.out.println(espresso1.getDescription() + ":" + espresso1.cost());    //输出espresso被mocha装饰后的描述与价格
        espresso1 = new Whip(espresso1);    //继续用whip装饰被mocha装饰后的espresso
        System.out.println(espresso1.getDescription() + ":" + espresso1.cost());    //输出被两种配料装饰后的描述与价格
    }
}
