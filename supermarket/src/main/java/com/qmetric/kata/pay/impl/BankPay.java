
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
public class BankPay implements Payment {

    private String sortCode;

    private String accountNumber;

    public boolean pay(double amount) {
        // make bank payment here :)
        // Amount is passed to this method
        // Sort Code and Account Number are available in this object
        // If the payment transaction is success then return true
        return true;
    }

}
