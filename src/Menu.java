import java.util.ArrayList;

public class Menu {
  private final ArrayList <Dish> dishes;
  private final String name;

  public Menu(ArrayList<Dish> dishes, String name) {
    this.dishes = dishes;
    this.name = name;
  }

  public void addDish(Dish dish) {
    dishes.add(dish);
  }
  public String getName() {
    return name;
  }
  public ArrayList<Dish> getDishes() {
    return dishes;
  }
  public int getTotalPrice() {
    return dishes.stream().mapToInt(Dish::getPrice).sum();
  }

  public void printMenu() {
    System.out.println("Meny: " + name);
    dishes.forEach(dish -> System.out.println(dish.toString()));
  }
}
