import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShoppingCartTest {

  @Test
  void addItem_succeeds() {
    // Arrange
    ShoppingCart cart = new ShoppingCart();
    ShoppingItem item = new ShoppingItem("Slime", 10.0);

    // Act
    CartActionResult result = cart.addItem(item);

    // Assert
    Assertions.assertEquals(CartActionResult.SUCCESS, result);
  }

  @Test
  void addAndRemoveItem_succeeds() {
    // TODO write this test
  }

  @Test
  void removeNonExistingItem_fails() {
    // TODO write this test
  }

  @Test
  void addItem_numOfItemsIsOne() {
    // TODO write this test
  }

  @Test
  void addAndRemoveItem_numOfItemsIsZero() {
    // TODO write this test
  }

}
