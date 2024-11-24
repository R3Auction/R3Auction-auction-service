package com.r3a.auction.domain.auction;

import java.util.Objects;

public class Product {

    private final String imagePath;
    private final String name;

    public Product(String imagePath, String name) {
        this.imagePath = imagePath;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return Objects.equals(imagePath, product.imagePath) && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imagePath, name);
    }
}
