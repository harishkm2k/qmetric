
package com.qmetric.kata;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

import com.qmetric.kata.domain.Item;
import com.qmetric.kata.domain.ItemPrice;


public class ItemPriceTest {

    @Test
    public void checkTotalItemsInTheSuperMarket() {
        assertEquals(4, ItemPrice.values().length);
    }

    @Test
    public void numberOfItemsAvailableInItemPriceShouldBeEqualToTotalItems() {
        assertEquals(Item.values().length, ItemPrice.values().length);
    }

    @Test
    public void itemsShouldHaveAppropriatePrice() {
        assertEquals(new BigDecimal(
            0.40), ItemPrice.APPLE.getPrice());
        assertEquals(new BigDecimal(
            1.25), ItemPrice.BREAD.getPrice());
        assertEquals(new BigDecimal(
            1.99), ItemPrice.CHEESE.getPrice());
        assertEquals(new BigDecimal(
            0.70), ItemPrice.FIZZY_DRINK.getPrice());
    }

}
