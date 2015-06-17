
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
public class AppleDiscountRule implements DiscountRule {

    protected static final int MINIMUM_NUMBER_OF_APPLES_ELIGIBLE_FOR_DISCOUNT = 3;

    protected static final BigDecimal DISCOUNTED_PRICE_PER_APPLE = new BigDecimal(
        0.33);

    public BigDecimal discountedValueOfAnItem() {
        // If Apples are purchased and if discount is available
        // then calculate the total cost of the apple
        return null;
    }

}
