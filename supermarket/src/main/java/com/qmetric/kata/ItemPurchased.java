
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

    private Integer quantity;

    public ItemPurchased(Item item, Integer quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public Item getItem() {
        return item;
    }

    public Integer getQuantity() {
        return quantity;
    }

}
