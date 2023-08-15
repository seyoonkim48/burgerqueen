package com.codestates.seb.burgerqueen.discount.discountCondition;

public interface DiscountCondition {
    boolean isSatisfied();
    void checkDiscountCondition();

    int applyDiscount(int price);
}
