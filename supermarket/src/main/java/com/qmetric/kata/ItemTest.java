
package com.qmetric.kata;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;


public class ItemTest {

    private Item item;

    @Test
    public void shouldHaveEnoughItem() {
        assertEquals(4, item.values().length);
    }

    @Test
    public void shouldMatchItemPrice() {
        assertEquals(new BigDecimal(
            0.40), item.APPLE.getPrice());
        assertEquals(new BigDecimal(
            1.25), item.BREAD.getPrice());
        assertEquals(new BigDecimal(
            1.99), item.CHEESE.getPrice());
        assertEquals(new BigDecimal(
            0.70), item.FIZZY_DRINK.getPrice());
    }

}
