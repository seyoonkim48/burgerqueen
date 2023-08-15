package com.codestates.seb.burgerqueen;

import com.codestates.seb.burgerqueen.discount.Discount;
import com.codestates.seb.burgerqueen.discount.discountCondition.CozDiscountCondition;
import com.codestates.seb.burgerqueen.discount.discountCondition.DiscountCondition;
import com.codestates.seb.burgerqueen.discount.discountCondition.KidsDiscountCondition;
import com.codestates.seb.burgerqueen.discount.discountPolicy.FixedAmountDiscountPolicy;
import com.codestates.seb.burgerqueen.discount.discountPolicy.FixedRateDiscountPolicy;
import com.codestates.seb.burgerqueen.product.Product;
import com.codestates.seb.burgerqueen.product.ProductRepository;

import java.util.Scanner;

public class OrderApp {
    private ProductRepository productRepository;
    private Menu menu;
    private Cart cart;
    private Order order;

    public OrderApp(ProductRepository productRepository, Menu menu, Cart cart, Order order) {
        this.productRepository = productRepository;
        this.menu = menu;
        this.cart = cart;
        this.order = order;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("🍔 BurgerQueen Order Service");
        while (true) {
            menu.printMenu();
            String input = scanner.nextLine();

            if (input.equals("+")) {
                order.makeOrder();
                break;
            }
            else {
                try {
                    int menuNumber = Integer.parseInt(input);
                    if (menuNumber == 0) {
                        cart.printCart();
                    } else if (1 <= menuNumber && menuNumber <= productRepository.getProducts().length) {
                        cart.addToCart(menuNumber);
                    } else {
                        System.out.println("⚠️ 메뉴 범위를 벗어난 선택입니다. 다시 선택해주세요.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("⚠️ 잘못된 입력입니다. 다시 선택해주세요.");
                }
            }
        }
    }
}
