
package com.qmetric.kata;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class ItemPriceTest {

    private ItemPrice itemPrice = new ItemPrice();

    @Test
    public void shouldHaveSameNumberOfItems() {
        assertEquals(4, itemPrice.getItemPriceMap().size());
    }

}
