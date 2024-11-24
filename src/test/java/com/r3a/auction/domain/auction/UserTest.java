package com.r3a.auction.domain.auction;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class UserTest {

    static final User user = new User(1L, 10000);

    @Test
    void create() {
        assertThat(new User(1L)).isEqualTo(new User(1L));
    }

    @Test
    void 입찰_성공() {
        Bid bid = user.addBid(AuctionTest.chairAuction, 1000);

        assertThat(bid).isEqualTo(new Bid(user, 1000));
    }

    @Test
    void 입찰_실패() {
        assertThatThrownBy(() -> {
            user.addBid(AuctionTest.chairAuction, 100000);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
