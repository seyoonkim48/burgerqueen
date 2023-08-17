package com.codestates.seb.burgerqueen;

/**
 * TODO
 * - 애플리케이션이면 Main이라는 클래스 보다는 `BurgerQueenApplication`이 바람직해 보입니다.
 */
public class Main {
    public static void main(String[] args) {
        AppConfigurer appConfigurer = new AppConfigurer();
        OrderApp orderApp = new OrderApp(
                appConfigurer.productRepository(),
                appConfigurer.menu(),
                appConfigurer.cart(),
                appConfigurer.order()
        );
        orderApp.start();
    }
}