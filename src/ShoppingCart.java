
public class ShoppingCart {

  private static final int MAX_NUM_OF_ITEMS_IN_CART = 5;

  private ShoppingItem[] shoppingItems;

  private int numOfItems;

  public ShoppingCart() {
    shoppingItems = new ShoppingItem[MAX_NUM_OF_ITEMS_IN_CART];
    numOfItems = 0;
  }

  public int getNumOfItems() {
    return numOfItems;
  }

  /**
   * Add item to shopping cart.
   */
  CartActionResult addItem(ShoppingItem item) {
    if (numOfItems < MAX_NUM_OF_ITEMS_IN_CART) {
      shoppingItems[numOfItems] = item;
      numOfItems++;
      return CartActionResult.SUCCESS;
    }
    return CartActionResult.FAIL;
  }

  /**
   * Remove item from shopping cart.
   */
  CartActionResult removeItem(ShoppingItem item) {
    for (int i = 0; i < numOfItems; i++) {
      if (shoppingItems[i] == item) {
        // Replace last item in cart with the one removed.
        shoppingItems[i] = shoppingItems[numOfItems - 1];
        shoppingItems[numOfItems - 1] = null;
        return CartActionResult.SUCCESS;
      }
    }
    // Item is not in the shopping cart
    return CartActionResult.FAIL;
  }

}
