public class Multiton {
  private static final Map<Object, Multiton> multitonInstance = new HashMap<Object, Multiton>();

  /**
  * Default constructor
  */
  private Multiton() {}

  public static Multiton getInstance(Object key) {
    Multiton instance = multitonInstance.get(key);

    if (instance == null) {
      synchronized (Multiton.class) {
        if (instance == null) {
          instance = new Multiton();
          multitonInstance.put(key, instance);
        }
      }
    }
    return instance;
  }

  public void otherOperation() {
    System.out.println("Multiton Other Operation...");
  }
}