package com.r3a.auction.domain.auction;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BidTest {

    @Test
    void create() {
        assertThat(new Bid(UserTest.user, 1000)).isEqualTo(new Bid(UserTest.user, 1000));
    }
}
