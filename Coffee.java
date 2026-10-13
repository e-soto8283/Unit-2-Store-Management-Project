public class Coffee extends Beverage {
  private boolean hasCreamer;
  private String roast;
  private int shotsOfEspresso;

  public Coffee() {
    super();
    hasCreamer = false;
    roast = "Medium";
    shotsOfEspresso = 1;
  }
 
  public Coffee(String name, String size, double price) {
    super(name, size, price);
    hasCreamer = false;
    roast = "Medium";
    shotsOfEspresso = 1;
  }
 
  public Coffee(String name, String size, double price,
                int calories, boolean hasCreamer,
                String roast, int shotsOfEspresso) {
    super(name, size, price, calories);
    this.hasCreamer = hasCreamer;
    this.roast = roast;
    this.shotsOfEspresso = shotsOfEspresso;
  }
 
  public boolean getHasCreamer() {
    return hasCreamer;
  }
 
  public void setHasCreamer(boolean hasCreamer) {
    this.hasCreamer = hasCreamer;
  }
  
  public String getRoast() {
    return roast;
  }
  
  public void setRoast(String roast) {
    this.roast = roast;
  }
 
  public int getShotsOfEspresso() {
    return shotsOfEspresso;
  }

  public void setShotsOfEspresso(int shotsOfEspresso) {
    this.shotsOfEspresso = shotsOfEspresso;
  }
 
  public String toString() {
    return super.toString()
        + ", Has Creamer: " + hasCreamer
        + ", Roast: " + roast
        + ", Espresso Shots: " + shotsOfEspresso;
  }
}
