
package com.qmetric.kata;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;


public class ItemPriceTest {

    private Item item;

    private ItemPrice itemPrice;

    @Test
    public void checkTotalItemsInTheSuperMarket() {
        assertEquals(4, itemPrice.values().length);
    }

    @Test
    public void eachItemInTheSuperMarketShouldHaveAPrice() {
        assertEquals(item.values().length, itemPrice.values().length);
    }

    @Test
    public void eachItemInTheSuperMarketShouldHaveAppropriatePrice() {
        assertEquals(new BigDecimal(
            0.40), itemPrice.APPLE.getPrice());
        assertEquals(new BigDecimal(
            1.25), itemPrice.BREAD.getPrice());
        assertEquals(new BigDecimal(
            1.99), itemPrice.CHEESE.getPrice());
        assertEquals(new BigDecimal(
            0.70), itemPrice.FIZZY_DRINK.getPrice());
    }

}
