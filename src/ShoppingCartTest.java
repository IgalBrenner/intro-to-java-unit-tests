import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ShoppingCartTest {

  @Test
  void addItem_succeeds() {
    // Arrange
    ShoppingCart cart = new ShoppingCart();
    ShoppingItem item = new ShoppingItem("Slime", 10.0);

    // Act
    int result = cart.addItem(item);

    // Assert
    Assertions.assertEquals(1, result);
  }

  @Test
  void addAndRemoveItem_succeeds() {
    ShoppingCart cart = new ShoppingCart();
    ShoppingItem item = new ShoppingItem("Slime", 10.0);

    cart.addItem(item);
    CartActionResult result = cart.removeItem(item);

    Assertions.assertEquals(CartActionResult.SUCCESS, result);
  }

  @Test
  void removeNonExistingItem_fails() {
    ShoppingCart cart = new ShoppingCart();
    ShoppingItem item = new ShoppingItem("Slime", 10.0);

    CartActionResult result = cart.removeItem(item);

    Assertions.assertEquals(CartActionResult.FAIL, result);
  }

  @Test
  void addItem_numOfItemsIsOne() {
    ShoppingCart cart = new ShoppingCart();
    ShoppingItem item = new ShoppingItem("Slime", 10.0);

    cart.addItem(item);
    int numOfItems = cart.getNumOfItems();

    Assertions.assertEquals(1, numOfItems);
  }

  @Test
  void addAndRemoveItem_numOfItemsIsZero() {
    ShoppingCart cart = new ShoppingCart();
    ShoppingItem item = new ShoppingItem("Slime", 10.0);

    cart.addItem(item);
    cart.removeItem(item);
    int numOfItems = cart.getNumOfItems();

    Assertions.assertEquals(0, numOfItems);
  }

}
