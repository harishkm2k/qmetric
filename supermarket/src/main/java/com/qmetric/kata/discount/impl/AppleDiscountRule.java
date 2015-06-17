
package com.qmetric.kata.discount.impl;

import java.math.BigDecimal;

import com.qmetric.kata.ItemPrice;
import com.qmetric.kata.ItemPurchased;
import com.qmetric.kata.discount.DiscountRule;


/**
 * INTERFACE SEGREGATION PRINCIPLE
 * 
 * As an implementing Class, this just returns the total price after the discounting calculated.
 * 
 * @author harish
 * 
 */
public class AppleDiscountRule implements DiscountRule {

    protected static final int MINIMUM_QUANITIY_ELIGIBLE_FOR_DISCOUNT = 3;

    protected static final BigDecimal DISCOUNTED_PRICE_PER_UNIT = new BigDecimal(
        0.33);

    public BigDecimal discountedValueOfAnItem(ItemPurchased itemPurchased) {
        // If discount is available then calculate the total cost of the apples
        if (itemPurchased.getQuantity() < MINIMUM_QUANITIY_ELIGIBLE_FOR_DISCOUNT) {
            double total = itemPurchased.getQuantity() * ItemPrice.APPLE.getPrice().doubleValue();
            return new BigDecimal(
                total);
        }

        int remaining = itemPurchased.getQuantity() % MINIMUM_QUANITIY_ELIGIBLE_FOR_DISCOUNT;

        double discounted =
            (itemPurchased.getQuantity() - remaining) * DISCOUNTED_PRICE_PER_UNIT.doubleValue();

        double nonDiscounted = remaining * ItemPrice.APPLE.getPrice().doubleValue();

        return new BigDecimal(
            discounted + nonDiscounted).setScale(2, BigDecimal.ROUND_UP);
    }
}
