package com.codestates.burgerqueenPlus.cart;


import java.util.ArrayList;
import java.util.List;

public class CartDatabase {
    private List<Cart> cartList = new ArrayList<>();

    public List<Cart> getCartList() {
        return cartList;
    }

    public void addCartList(Cart cart) {
        cartList.add(cart);
    }
}
