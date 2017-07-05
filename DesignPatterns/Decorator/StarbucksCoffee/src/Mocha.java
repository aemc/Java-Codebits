
public class Mocha extends Beverage {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDesc() {
        return beverage.getDesc() + ", Mocha";
    }

    public double cost() {
        return .20 + beverage.cost();
    }
}
