package com.gavinfinancialgroup.prontoshop.model;

/**
 * Created by zhang on 5/28/2017.
 */

public class LineItem extends Product{
    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private double getSumPrice (){
        return getSalePrice() * quantity;
    }
}
