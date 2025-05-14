package com.example.shoppingcart;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class ShoppingCartTest {

    @Test
    void shouldAddProductToCart() {
        ShoppingCart cart = new ShoppingCart();
        Product product = new Product("Apple", 10.0);

        cart.addProduct(product, 1);

        assertThat(cart.getItems()).containsEntry(product, 1);
    }
    @Test
    void shouldRemoveProductFromCart() {
        ShoppingCart cart = new ShoppingCart();
        Product product = new Product("Banana", 5.0);

        cart.addProduct(product, 2);
        cart.removeProduct(product);

        assertThat(cart.getItems()).doesNotContainKey(product);
    }
    @Test
    void shouldCalculateTotalPrice() {
        ShoppingCart cart = new ShoppingCart();
        Product apple = new Product("Apple", 10.0);
        Product banana = new Product("Banana", 5.0);

        cart.addProduct(apple, 2);  // 2 x 10 = 20
        cart.addProduct(banana, 3); // 3 x 5 = 15

        double total = cart.getTotalPrice();

        assertThat(total).isEqualTo(35.0);
    }

}
