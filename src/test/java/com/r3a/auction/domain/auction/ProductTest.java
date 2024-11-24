package com.r3a.auction.domain.auction;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ProductTest {

    static final Product chair = new Product("chair.jpg", "의자");

    @Test
    void create() {
        assertThat(new Product("chair.jpg", "의자")).isEqualTo(new Product("chair.jpg", "의자"));
    }
}
