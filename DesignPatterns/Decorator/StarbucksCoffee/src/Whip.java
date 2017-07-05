
public class Whip extends Beverage {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDesc() {
        return beverage.getDesc() + ", Whip";
    }

    public double cost() {
        return .20 + beverage.cost();
    }
}
