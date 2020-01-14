
public class ShoppingItem {

  private String name;

  private double price;

  public ShoppingItem(String description, double price) {
    this.name = description;
    this.price = price;
  }

  public String getDescription() {
    return name;
  }

  public void setDescription(String description) {
    this.name = description;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

}
