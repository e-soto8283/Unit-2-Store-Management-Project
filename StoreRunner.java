import java.util.Scanner;
public class StoreRunner {
  public static void main(String[] args) {

    Beverage drink1 = new Beverage();
    Coffee coffee1 = new Coffee();
    Tea tea1 = new Tea();
   
    Beverage drink2 =
        new Beverage("Lemonade", "Medium", 2.50);
    Coffee coffee2 =
        new Coffee("Latte", "Large", 4.75);
    Coffee coffee3 =
        new Coffee("Espresso", "Small", 3.00,
                   10, false, "Dark", 2);
    Tea tea2 =
        new Tea("Iced Tea", "Medium", 2.75);
    Tea tea3 =
        new Tea("Honey Green Tea", "Large", 3.50,
                120, true, "Green");

    coffee2.setRoast("Light");
    tea2.setHasHoney(true);
    System.out.println("=== MY BEVERAGE STORE ===");
    System.out.println("\nDefault Beverage:");
    System.out.println(drink1);
    System.out.println("\nDefault Coffee:");
    System.out.println(coffee1);
    System.out.println("\nDefault Tea:");
    System.out.println(tea1);
    System.out.println("\nLemonade:");
    System.out.println(drink2);
    System.out.println("\nLatte:");
    System.out.println(coffee2);
    System.out.println("\nEspresso:");
    System.out.println(coffee3);
    System.out.println("\nIced Tea:");
    System.out.println(tea2);
    System.out.println("\nHoney Green Tea:");
    System.out.println(tea3);
  }
}
