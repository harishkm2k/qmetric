
package com.qmetric.kata;

/**
 * SINGE RESPONSIBLITY
 * 
 * Store the Item purchased and the quanitity of items.
 * 
 * @author harish
 * 
 */
public class ItemPurchased {

    private Item item;

    private int quantity;

    public ItemPurchased(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public Item getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

}
