import java.util.ArrayList;
import java.util.stream.Stream;

public class Register {
  private final ArrayList<Dish> dishes;
  private final ArrayList<Menu> menus;
  public Register(ArrayList<Dish> dishes, ArrayList<Menu> menus) {
    this.dishes = dishes;
    this.menus = menus;
  }
  public void addDish(Dish dish) {
    dishes.add(dish);
  }
  public Dish getDish(String name) {
    return dishes.stream().filter(dish -> dish.getName().equals(name)).findFirst().orElse(null);
  }
  public Stream<Dish> getDishesBasedType(String type) {
    return dishes.stream().filter(dish -> dish.getType().equals(type));
  }

  public void addMenu(Menu menu) {
    menus.add(menu);
  }
  public Menu getMenu(String name) {
    return menus.stream().filter(menu -> menu.getName().equals(name)).findFirst().orElse(null);
  }
  public void addDishToMenu(Dish dish, Menu menu) {
    menu.addDish(dish);
  }
  public Stream<Menu> getMenusBasedPriceInterval (int price1, int price2) {
    return menus.stream().filter(menu -> menu.getTotalPrice() >= price1 && menu.getTotalPrice() <= price2);
  }

}
