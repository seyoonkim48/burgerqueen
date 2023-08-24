package com.codestates.burgerqueen;

import com.codestates.burgerqueen.discount.Discount;
import com.codestates.burgerqueen.discount.discountCondition.CozDiscountCondition;
import com.codestates.burgerqueen.discount.discountCondition.DiscountCondition;
import com.codestates.burgerqueen.discount.discountCondition.KidsDiscountCondition;
import com.codestates.burgerqueen.discount.discountPolicy.FixedAmountDiscountPolicy;
import com.codestates.burgerqueen.discount.discountPolicy.FixedRateDiscountPolicy;
import com.codestates.burgerqueen.product.ProductRepository;

public class AppConfigurer {
    private Cart cart = new Cart(productRepository(), menu());
    public ProductRepository productRepository() {
        return new ProductRepository();
    }

    public Menu menu() {
        return new Menu(productRepository().getProducts());
    }
    public Cart cart() {
        return cart;
    }

    public Discount discount() {
        return new Discount(new DiscountCondition[]{
                new CozDiscountCondition(new FixedRateDiscountPolicy(10)),
                new KidsDiscountCondition(new FixedAmountDiscountPolicy(500))
        });
    }

    public Order order() {
        return new Order(cart(), discount());
    }
}
