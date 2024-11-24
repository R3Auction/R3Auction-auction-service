package com.r3a.auction.domain.auction;

import java.util.Objects;

public class Bid {

    private final User user;
    private final int price;

    public Bid(User user, int price) {
        this.user = user;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bid bid)) return false;
        return price == bid.price && Objects.equals(user, bid.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, price);
    }
}
