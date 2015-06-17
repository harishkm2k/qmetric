
package com.qmetric.kata.discount.impl;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import com.qmetric.kata.discount.impl.AppleDiscountRule;
import com.qmetric.kata.domain.Item;
import com.qmetric.kata.domain.ItemPurchased;


public class AppleDiscountRuleTest {

    private AppleDiscountRule appleDiscountRule = new AppleDiscountRule();

    @Test
    public void checkTheMinimumNumberofApplesEligibleForDiscount() {
        assertEquals(3, AppleDiscountRule.MINIMUM_QUANITIY_ELIGIBLE_FOR_DISCOUNT);
    }

    @Test
    public void checkApplesDiscountedPrice() {
        assertEquals(new BigDecimal(
            0.33), AppleDiscountRule.DISCOUNTED_PRICE_PER_UNIT);
    }

    @Test
    public void checkDiscountedValueWhenOneAppleIsPurchased() {
        assertEquals(new BigDecimal(
            0.4), appleDiscountRule.discountedValueOfAnItem(new ItemPurchased(
            Item.APPLE, 1)));
    }

    @Test
    public void checkDiscountedValueWhenTwoApplesArePurchased() {
        assertEquals(new BigDecimal(
            0.8), appleDiscountRule.discountedValueOfAnItem(new ItemPurchased(
            Item.APPLE, 2)));
    }

    @Test
    public void checkDiscountedValueWhenThreeApplesArePurchased() {
        assertEquals(new BigDecimal(
            0.99).setScale(2, BigDecimal.ROUND_UP),
            appleDiscountRule.discountedValueOfAnItem(new ItemPurchased(
                Item.APPLE, 3)));
    }
}
