package com.r3a.auction.domain.auction;

import java.time.LocalDate;
import java.util.Objects;

public class AuctionDate {

    private final LocalDate startAt;
    private final LocalDate endAt;

    public AuctionDate(LocalDate startAt, LocalDate endAt) {
        this.startAt = startAt;
        this.endAt = endAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AuctionDate that)) return false;
        return Objects.equals(startAt, that.startAt) && Objects.equals(endAt, that.endAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startAt, endAt);
    }
}
