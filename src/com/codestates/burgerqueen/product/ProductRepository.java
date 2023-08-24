package com.codestates.burgerqueen.product;

import com.codestates.burgerqueen.product.subproduct.Drink;
import com.codestates.burgerqueen.product.subproduct.Hamburger;
import com.codestates.burgerqueen.product.subproduct.Side;

public class ProductRepository {
    private final Product[] products = {
            new Hamburger(1, "새우버거", 3500, 500, false, 4500),
            new Hamburger(2, "치킨버거", 4000, 600, false, 5000),
            new Side(3, "감자튀김", 1000, 300, 1),
            new Side(4, "어니언링", 1000, 300, 1),
            new Drink(5, "코카콜라", 1000, 200, true),
            new Drink(6, "제로콜라", 1000, 0, true),
    };

    public Product[] getProducts() {
        return products;
    }

    public Product findById(int productId) {
        for (Product product : products) {
            if (product.getId() == productId) {
                return product;
            }
        }
        return null;
    }
}
