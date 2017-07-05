/**
 * Created by Miel on 2017-07-05.
 */
public class Soy extends Beverage {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDesc() {
        return beverage.getDesc() + ", Soy";
    }

    public double cost() {
        return .20 + beverage.cost();
    }
}
