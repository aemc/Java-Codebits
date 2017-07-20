public class BirdCall {
    public static void main(String[] args) {
        BirdFactory factory = new BirdFactory();
        Bird owl = factory.getBird("OWL");
        Bird eagle = factory.getBird("EAGLE");
        Bird finch = factory.getBird("FINCH");

        owl.fly();
        eagle.fly();
        finch.fly();
    }
}
