public class Dish {
  private final String name;
  private final String type;
  private final int price;
  private final String recipe;

  public Dish(String name, String type, int price, String recipe) {
    this.name = name;
    this.type = type;
    this.price = price;
    this.recipe = recipe;
  }

  public String getName() {
    return name;
  }

  public String getType() {
    return type;
  }

  public int getPrice() {
    return price;
  }

  public String getRecipe() {
    return recipe;
  }
  public String toString() {
    return name + " : " + type + " : " + price + " : " + recipe;
  }
}
