package com.programowanie.smell.bar;

public class SimpleBeverage implements Beverege {

    private int price;

    public SimpleBeverage(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean isAmountLimited() {
        return false;
    }

    public boolean isEligableForStudentDiscount() {
        return true;
    }
}
