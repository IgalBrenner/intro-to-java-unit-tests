import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ShoppingCartTest {

  private ShoppingCart cart;
  private ShoppingItem item;

  @BeforeEach
  void setUp() {
    cart = new ShoppingCart();
    item = new ShoppingItem("Slime", 10.0);
  }

  @Test
  void addItem_succeeds() {
    // Arrange

    // Act
    int result = cart.addItem(item);

    // Assert
    Assertions.assertEquals(1, result);
  }

  @Test
  void addAndRemoveItem_succeeds() {
    cart.addItem(item);
    int result = cart.removeItem(item);

    Assertions.assertEquals(1, result);
  }

  @Test
  void removeNonExistingItem_fails() {
    int result = cart.removeItem(item);

    Assertions.assertEquals(0, result);
  }

  @Test
  void addItem_numOfItemsIsOne() {
    cart.addItem(item);
    int numOfItems = cart.getNumOfItems();

    Assertions.assertEquals(1, numOfItems);
  }

  @Test
  void addAndRemoveItem_numOfItemsIsZero() {
    cart.addItem(item);
    cart.removeItem(item);
    int numOfItems = cart.getNumOfItems();

    Assertions.assertEquals(0, numOfItems);
  }

}
