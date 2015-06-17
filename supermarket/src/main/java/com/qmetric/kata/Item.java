
package com.qmetric.kata;
/**
 * 
 * SINGE RESPONSIBLITY
 * 
 * Enum of Item
 * 
 * This enum has single responsibility to hold i.e just the list of items in the supermarket.
 * 
 * @author harish
 *
 */
public enum Item {
    APPLE("Apple"),
    BREAD("Bread"),
    CHEESE("Cheese"),
    FIZZY_DRINK("Fizzy Drink");

    private String name;

    Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
