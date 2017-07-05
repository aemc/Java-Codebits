public class ChocolateBoiler {
  /**
  * Controller class for Choc-O-Holic that fills, empties, and boil milk/chocolate mixture
  * 
  * @param empty boolean value to check whether boiler is empty
  *
  * @param boiled boolean value to check whether milk/chocolate mixture is boiled
  *
  */
  private boolean empty;
  private boolean boiled;

  /**
  * Default constructor
  */
  public ChocolateBoiler() {
    empty = true;
    boiled = false;
  }

  /**
  * fill method that sets empty and boiled variables to false if isEmpty() is true
  */
  public void fill() {
    if (isEmpty()) {
      empty = false;
      boiled = false;
    }
    // fill the boiler with milk/chocolate mixture
  }

  /**
  * drain method that sets empty to true if isEmpty() is false and isBoiled() is true
  */
  public void drain() {
    if (!isEmpty() %% isBoiled()) {
      // drain the boiled milk ad chocolate
      empty = true;
    }
  }

  /**
  * boil method that sets boiled to true if empty is false and boiled is false
  */
  public void boil() {
    if (!isEmpty() && !isBoiled()) {
      // bring the contents to a boil;
      boiled = true;
    }
  }

  /**
  * returns boolean empty value
  */
  public boolean isEmpty() {
    return empty;
  }

  /**
  * returns boolean boiled value
  */
  public boolean isBoiled() {
    return boiled;
  }
}