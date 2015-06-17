
package com.qmetric.kata.discount.impl;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import com.qmetric.kata.discount.impl.FizzyDrinkDiscountRule;


public class FizzyDrinkDiscountRuleTest {

    @Test
    public void checkTheMinimumNumberofFizzyDrinkEligibleForDiscount() {
        assertEquals(3, FizzyDrinkDiscountRule.MINIMUM_QUANITIY_ELIGIBLE_FOR_DISCOUNT);
    }

    @Test
    public void checkFizzyDrinkDiscountedPrice() {
        assertEquals(new BigDecimal(
            0.46), FizzyDrinkDiscountRule.DISCOUNTED_PRICE_PER_UNIT);
    }

}
