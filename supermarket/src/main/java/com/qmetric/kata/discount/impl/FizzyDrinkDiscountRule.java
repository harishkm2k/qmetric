
package com.qmetric.kata.discount.impl;

import java.math.BigDecimal;

import com.qmetric.kata.discount.DiscountRule;


/**
 * INTERFACE SEGREGATION PRINCIPLE
 * 
 * As an implementing Class, this just returns the total price after the discounting calculated.
 * 
 * @author harish
 * 
 */
public class FizzyDrinkDiscountRule implements DiscountRule {

    protected static final int MINIMUM_NUMBER_OF_FIZZY_DRINK_ELIGIBLE_FOR_DISCOUNT = 3;

    // Fizzy Drink 70p ( discount 3 for the price of 2) - which means one fizzy drink would be 0.46
    protected static final BigDecimal DISCOUNTED_PRICE_PER_FIZZY_DRINK = new BigDecimal(
        0.46);

    public BigDecimal discountedValueOfAnItem() {
        // If Fizzy Drinks are purchased and if discount is available
        // then calculate the total cost of the fizzy drink
        return null;
    }

}
