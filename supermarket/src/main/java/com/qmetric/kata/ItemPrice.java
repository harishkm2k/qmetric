
package com.qmetric.kata;

import java.math.BigDecimal;

/**
 * 
 * SINGE RESPONSIBLITY
 * 
 * This enum has single responsibility to hold i.e just the price list of items in the supermarket.
 * 
 * @author harish
 *
 */
public enum ItemPrice {
    APPLE(new BigDecimal(.40)),
    BREAD(new BigDecimal(1.25)),
    CHEESE(new BigDecimal(1.99)),
    FIZZY_DRINK(new BigDecimal(.70));

    private BigDecimal price;

    ItemPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

}
