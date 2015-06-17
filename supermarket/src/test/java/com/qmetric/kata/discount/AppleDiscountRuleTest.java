
package com.qmetric.kata.discount;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;


public class AppleDiscountRuleTest {

    private AppleDiscountRule appleDiscountRule = new AppleDiscountRule();

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
