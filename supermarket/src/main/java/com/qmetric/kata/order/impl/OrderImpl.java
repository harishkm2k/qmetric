
package com.qmetric.kata.order.impl;

import java.util.ArrayList;
import java.util.List;

import com.qmetric.kata.domain.ItemPurchased;
import com.qmetric.kata.order.Order;


/**
 * 
 * @author harish
 * 
 */
public class OrderImpl implements Order {

    private List<ItemPurchased> itemsPurchased = new ArrayList<ItemPurchased>();

    public void add(ItemPurchased itemPurchased) {
        itemsPurchased.add(itemPurchased);
    }

    public List<ItemPurchased> getItemsPurchased() {
        return itemsPurchased;
    }

}
