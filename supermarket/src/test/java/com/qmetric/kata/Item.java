
package com.qmetric.kata;

import java.math.BigDecimal;


public enum Item {
    APPLE(
        "Apple", new BigDecimal(
            .40)), BREAD(
        "Bread", new BigDecimal(
            1.25)), CHEESE(
        "Cheese", new BigDecimal(
            1.99)), FIZZY_DRINK(
        "Fizzy Drink", new BigDecimal(
            .70));

    private String name;

    private BigDecimal price;

    Item(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
