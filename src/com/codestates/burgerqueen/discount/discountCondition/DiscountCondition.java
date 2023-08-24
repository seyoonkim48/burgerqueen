package com.codestates.burgerqueen.discount.discountCondition;

public interface DiscountCondition {
    boolean isSatisfied();
    void checkDiscountCondition();

    int applyDiscount(int price);
}
