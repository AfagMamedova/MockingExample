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
}
