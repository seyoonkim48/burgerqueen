package com.codestates.burgerqueenPlus.discount.discountCondition;

public interface DiscountCondition {
    boolean isSatisfied();
    void checkDiscountCondition();

    int applyDiscount(int price);
}
