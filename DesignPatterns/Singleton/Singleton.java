public class Singleton {
  /**
   * Singleton implementation in Java
   */
  private static Singleton uniqueInstance;

  public static Singleton getInstance() {
    if (uniqueInstance == null) {
      uniqueInstance = new Singleton();
    }
    return uniqueInstance;
  }
}