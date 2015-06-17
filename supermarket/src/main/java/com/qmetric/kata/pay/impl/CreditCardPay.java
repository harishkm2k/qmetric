
package com.qmetric.kata.pay.impl;

import com.qmetric.kata.pay.Payment;


/**
 * Single Responsibility Principle
 * 
 * Open / Closed Principle
 * 
 * Interface Segregation Principle
 * 
 * @author harish
 * 
 */
public class CreditCardPay implements Payment {
    private String creditCarNumber; // Assume encrypted :) - hence secured

    private String expiryDate; // Assume the format :)

    private String cvv; // Assume encrypted :) - hence secured

    private String name; // Assume encrypted :) - hence secured

    public boolean pay(double amount) {
        // make bank payment here :)
        // Amount is passed to this method
        // Credit Card number, CVV and expiry date are available in this object
        // If the payment transaction is success then return true
        return true;
    }
}
