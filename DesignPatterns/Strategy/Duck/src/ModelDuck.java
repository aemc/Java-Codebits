/**
 * Created by Miel on 2017-06-21.
 */
public class ModelDuck extends Duck{
    public ModelDuck() {
        flyBehavior = new FlyRocketPowered();
        quackBehavior = new MuteQuack();
    }
    public void display() {
        System.out.println("I'm a model duck");
    }
}
