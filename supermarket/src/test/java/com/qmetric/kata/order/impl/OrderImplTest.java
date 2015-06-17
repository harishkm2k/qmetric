
package com.qmetric.kata.order.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;

import com.qmetric.kata.Item;
import com.qmetric.kata.ItemPurchased;
import com.qmetric.kata.order.Order;


public class OrderImplTest {

    // Check an exception here - when there is nothing in the Order
    @Test(expected = IndexOutOfBoundsException.class)
    public void checkThereIsNothingAddedToOrder() {

        Order order = new OrderImpl();

        // Check if order is empty
        assertEquals(0, order.getItemsPurchased().size());

        // Check if item in order is correct
        assertSame(Item.APPLE, order.getItemsPurchased().get(0).getItem());

    }

    @Test
    public void checkListOfPurchasedItems() {
        Order order = new OrderImpl();

        // add an item to order with some quantity
        order.add(new ItemPurchased(
            Item.APPLE, 10));

        // Check if number of items match
        assertEquals(1, order.getItemsPurchased().size());

        // Check if item in order is correct
        assertSame(Item.APPLE, order.getItemsPurchased().get(0).getItem());

        // Check if quantity of item in order is correct
        assertEquals(10, order.getItemsPurchased().get(0).getQuantity().intValue());
    }
}
