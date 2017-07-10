public abstract class Beverage {
    String desc = "Unknown Beverage";

    /**
     * Returns the description of the beverage
     */
    public String getDesc() {
        return desc;
    }

    public abstract double cost();
}
