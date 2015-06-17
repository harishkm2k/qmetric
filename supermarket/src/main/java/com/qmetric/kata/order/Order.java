
package com.qmetric.kata.order;

import java.util.List;

import com.qmetric.kata.domain.ItemPurchased;


/**
 * INTERFACE SEGREGATION PRINCIPLE
 * 
 * This is an interface which calculate the total items purchased by the customer.
 * 
 * @author harish
 * 
 */
public interface Order {

    public void add(ItemPurchased itemPurchased);

    public List<ItemPurchased> getItemsPurchased();
}
