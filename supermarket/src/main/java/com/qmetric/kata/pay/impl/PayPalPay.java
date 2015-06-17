
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
public class PayPalPay implements Payment {

    private String paypalLogin;

    private String password; // Assume encrypted :) - hence secured

    public boolean pay(double amount) {
        // make bank payment here :)
        // Amount is passed to this method
        // Credit Card number, CVV and expiry date are available in this object
        // If the payment transaction is success then return true
        return true;
    }

}
