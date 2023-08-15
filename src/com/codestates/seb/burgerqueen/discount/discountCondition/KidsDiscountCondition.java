package com.codestates.seb.burgerqueen.discount.discountCondition;

import com.codestates.seb.burgerqueen.discount.discountPolicy.DiscountPolicy;
import com.codestates.seb.burgerqueen.discount.discountPolicy.FixedAmountDiscountPolicy;

import java.util.Scanner;

public class KidsDiscountCondition implements DiscountCondition {
    private boolean isSatisfied;
    private DiscountPolicy discountPolicy;

    public KidsDiscountCondition(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }

    public boolean isSatisfied() {
        return isSatisfied;
    }

    private void setSatisfied(boolean satisfied) {
        isSatisfied = satisfied;
    }

    public void checkDiscountCondition() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("나이가 어떻게 되십니까?");
        String input = scanner.nextLine();
        try {
            int age = Integer.parseInt(input);
            setSatisfied(age < 20);
        } catch (NumberFormatException e) {
            setSatisfied(false);
            System.out.println("⚠️ 잘못된 선택입니다. 20세 이상으로 적용됩니다.");
        }

    }

    public int applyDiscount(int price) {
        return discountPolicy.calculateDiscountedPrice(price);
    }
}
