
package com.qmetric.kata;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class ItemTest {

    private Item item;

    @Test
    public void shouldCheckTotalItemsInTheSuperMarket() {
        assertEquals(4, item.values().length);
    }

}
