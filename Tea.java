public class Tea extends Beverage {
  private boolean hasHoney;
  private String teaType;

  public Tea() {
    super();
    hasHoney = false;
    teaType = "Green";
  }
  
  public Tea(String name, String size, double price) {
    super(name, size, price);
    hasHoney = false;
    teaType = "Green";
  }
  
  public Tea(String name, String size, double price,
             int calories, boolean hasHoney, String teaType) {
    super(name, size, price, calories);
    this.hasHoney = hasHoney;
    this.teaType = teaType;
  }
 
  public boolean getHasHoney() {
    return hasHoney;
  }
  
  public void setHasHoney(boolean hasHoney) {
    this.hasHoney = hasHoney;
  }
  
  public String getTeaType() {
    return teaType;
  }
 
  public void setTeaType(String teaType) {
    this.teaType = teaType;
  }
 
  public String toString() {
    return super.toString()
        + ", Has Honey: " + hasHoney
        + ", Tea Type: " + teaType;
  }
}
