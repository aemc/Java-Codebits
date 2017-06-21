/**
 * Created by Miel on 2017-06-21.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyWithWings());
        model.performFly();
        model.performQuack();
        model.display();
    }
}
