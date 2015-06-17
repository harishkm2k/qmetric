
package com.qmetric.kata;

import java.math.BigDecimal;
import java.util.HashMap;


public class ItemPrice {

    private HashMap<Item, BigDecimal> itemPriceMap;

    ItemPrice() {
        itemPriceMap = new HashMap<Item, BigDecimal>(
            Item.values().length);
        for (Item item : Item.values()) {
            itemPriceMap.put(item, null);
        }
    }

    public HashMap<Item, BigDecimal> getItemPriceMap() {
        return itemPriceMap;
    }

}
