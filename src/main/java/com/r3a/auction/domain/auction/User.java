package com.r3a.auction.domain.auction;

import com.r3a.auction.domain.Point;

import java.util.Objects;

public class User {
    private final long id;
    private final Point point;

    public User(long id) {
        this(id, new Point(0));
    }

    public User(long id, int point) {
        this(id, new Point(point));
    }

    public User(long id, Point point) {
        this.id = id;
        this.point = point;
    }

    public Bid addBid(Auction chairAuction, int price) {
        point.decrease(price);
        Bid bid = new Bid(this, price);
        chairAuction.addBid(bid);
        return bid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

}
