
package com.qmetric.kata.discount.impl;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import com.qmetric.kata.discount.impl.AppleDiscountRule;


public class AppleDiscountRuleTest {

    @Test
    public void checkTheMinimumNumberofApplesEligibleForDiscount() {
        assertEquals(3, AppleDiscountRule.MINIMUM_NUMBER_OF_APPLES_ELIGIBLE_FOR_DISCOUNT);
    }

    @Test
    public void checkApplesDiscountedPrice() {
        assertEquals(new BigDecimal(
            0.33), AppleDiscountRule.DISCOUNTED_PRICE_PER_APPLE);
    }

}
