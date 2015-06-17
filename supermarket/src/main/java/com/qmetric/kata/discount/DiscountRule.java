
package com.qmetric.kata.discount;

import java.math.BigDecimal;

import com.qmetric.kata.domain.ItemPurchased;


/**
 * INTERFACE SEGREGATION PRINCIPLE
 * 
 * This is an interface each Item which has discount has to implement.
 * 
 * @author harish
 * 
 */
public interface DiscountRule {

    public BigDecimal discountedValueOfAnItem(ItemPurchased itemPurchased);

}
