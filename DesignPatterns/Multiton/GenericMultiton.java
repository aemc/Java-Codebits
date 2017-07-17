public class Multiton<T> {
    private static final Map<T, Multiton> multitonInstance = new HashMap<T, Multiton>();

    private Multiton() {}

    public static Multiton getIstance(T t) {
        Multiton instance = multitonInstance.get(t);

        if (instance == null) {
            instance = new Multiton();
            multitonInstance.put(t, instance);
        }
        return instance;
    }
}