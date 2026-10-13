public class Beverage {
  private String name;
  private String size;
  private double price;
  private int calories;
 
  public Beverage() {
    name = "Water";
    size = "Small";
    price = 0.0;
    calories = 0;
  }
  public Beverage(String name, String size, double price) {
    this.name = name;
    this.size = size;
    this.price = price;
    calories = 0;
  }
  
  public Beverage(String name, String size, double price,
                  int calories) {
    this.name = name;
    this.size = size;
    this.price = price;
    this.calories = calories;
  }
  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
 
  public String getSize() {
    return size;
  }
  
  public void setSize(String size) {
    this.size = size;
  }
  
  public double getPrice() {
    return price;
  }
  
  public void setPrice(double price) {
    this.price = price;
  }
  
  public int getCalories() {
    return calories;
  }
  
  public void setCalories(int calories) {
    this.calories = calories;
  }
 
  public String toString() {
    return "Name: " + name
        + ", Size: " + size
        + ", Price: $" + price
        + ", Calories: " + calories;
  }
}
