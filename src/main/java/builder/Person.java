package builder;

public class Person {
    /*名字（必须）*/
    private final String name;
    /*性别（必须）*/
    private final String gender;
    /*年龄（非必须）*/
    private final String age;
    /*鞋子（非必须）*/
    private final String shoes;
    /*衣服（非必须）*/
    private final String clothes;
    /*钱（非必须）*/
    private final String money;
    /*房子（非必须）*/
    private final String house;
    /*汽车（非必须）*/
    private final String car;
    /*职业（非必须）*/
    private final String career;

    private Person(Builder builder) {
        this.name = builder.name;
        this.gender = builder.gender;
        this.age = builder.age;
        this.shoes = builder.shoes;
        this.clothes = builder.clothes;
        this.money = builder.money;
        this.house = builder.house;
        this.car = builder.car;
        this.career = builder.career;
    }

    public static void main(String[] args) {
        Person person = new Person.Builder("张三", "男")
                .age("12")
                .money("1000000")
                .car("宝马")
                .build();
        System.out.println(person);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age='" + age + '\'' +
                ", shoes='" + shoes + '\'' +
                ", clothes='" + clothes + '\'' +
                ", money='" + money + '\'' +
                ", house='" + house + '\'' +
                ", car='" + car + '\'' +
                ", career='" + career + '\'' +
                '}';
    }

    public static class Builder {
        private final String name;
        private final String gender;
        private String age;
        private String shoes;
        private String clothes;
        private String money;
        private String house;
        private String car;
        private String career;

        private Builder(String name, String gender) {
            this.name = name;
            this.gender = gender;
        }

        private Builder age(String age) {
            this.age = age;
            return this;
        }

        private Builder car(String car) {
            this.car = car;
            return this;
        }

        private Builder shoes(String shoes) {
            this.shoes = shoes;
            return this;
        }

        private Builder clothes(String clothes) {
            this.clothes = clothes;
            return this;
        }

        private Builder money(String money) {
            this.money = money;
            return this;
        }

        private Builder house(String house) {
            this.house = house;
            return this;
        }

        private Builder career(String career) {
            this.career = career;
            return this;
        }

        private Person build() {
            return new Person(this);
        }
    }
}

