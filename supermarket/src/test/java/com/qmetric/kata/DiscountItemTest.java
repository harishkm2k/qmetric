
package com.qmetric.kata;

import static org.junit.Assert.*;

import org.junit.Test;


public class DiscountItemTest {

    @Test
    public void checkTheNumberOfItemsAvailableInDiscount() {
        assertEquals(2, DiscountItem.values().length);
    }

    @Test
    public void numberOfItemsAvailableInDiscountShouldBeLessThanOrEqualToTotalItem() {
        assertTrue(DiscountItem.values().length < Item.values().length);
    }

    @Test
    public void checkItemAvailableInDiscountIsAppropriate() {
        assertEquals(Item.APPLE.toString(), DiscountItem.APPLE.toString());
        assertEquals(Item.FIZZY_DRINK.toString(), DiscountItem.FIZZY_DRINK.toString());
    }
}
