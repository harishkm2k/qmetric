
package com.qmetric.kata;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.qmetric.kata.domain.Item;


public class ItemTest {

    @Test
    public void checkTotalItemsInTheSuperMarket() {
        assertEquals(4, Item.values().length);
    }

}
