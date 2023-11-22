import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    System.out.println("ØVING 10 OPPGAVE 2");
    ArrayList<Dish> dishes = new ArrayList<>();
    ArrayList<Menu> menus = new ArrayList<>();

    Register register = new Register(dishes, menus);

    register.addDish(new Dish("Pizza", "Hovedrett", 1000, "Tomatsaus, ost, skinke, paprika, løk"));
    register.addDish(new Dish("Pasta", "Hovedrett", 1000, "Pasta, kjøttsaus, ost"));
    register.addDish(new Dish("Kyllingsalat", "Forrett", 1000, "Kylling, salat, dressing"));
    register.addDish(new Dish("Kung pao", "Hovedrett", 100, "Kylling, ris, grønnsaker, peanøtter"));
    register.addDish(new Dish("Stekt ris", "Forrett", 100, "Ris, grønnsaker, egg, kylling"));

    System.out.println("Retter");
    System.out.println(register.getDish("Pizza").toString());
    System.out.println(register.getDish("Pasta").toString());
    System.out.println(register.getDish("Kyllingsalat").toString());
    System.out.println(register.getDish("Kung pao").toString());
    System.out.println(register.getDish("Stekt ris").toString());
    System.out.println(" ");

    register.addMenu(new Menu(new ArrayList<>(), "Italiensk"));
    register.addMenu(new Menu(new ArrayList<>(), "Kinesisk"));

    register.addDishToMenu(register.getDish("Pizza"), register.getMenu("Italiensk"));
    register.addDishToMenu(register.getDish("Pasta"), register.getMenu("Italiensk"));
    register.addDishToMenu(register.getDish("Kyllingsalat"), register.getMenu("Italiensk"));
    register.addDishToMenu(register.getDish("Kung pao"), register.getMenu("Kinesisk"));
    register.addDishToMenu(register.getDish("Stekt ris"), register.getMenu("Kinesisk"));

    System.out.println("Menyer");
    register.getMenu("Italiensk").printMenu();
    register.getMenu("Kinesisk").printMenu();
    System.out.println(" ");

    System.out.println("Basert på type");
    register.getDishesBasedType("Forrett").forEach(dish -> System.out.println(dish.toString()));
    register.getDishesBasedType("Hovedrett").forEach(dish -> System.out.println(dish.toString()));
    System.out.println(" ");

    System.out.println("Pris intervall");
    register.getMenusBasedPriceInterval(50, 500).forEach(menu -> System.out.println(menu.getName()));
  }
}