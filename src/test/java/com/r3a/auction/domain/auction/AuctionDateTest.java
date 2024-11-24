package com.r3a.auction.domain.auction;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class AuctionDateTest {

    static final AuctionDate date = new AuctionDate(LocalDate.now(), LocalDate.now().plusDays(2));

    @Test
    void create() {
        Assertions.assertThat(new AuctionDate(LocalDate.now(), LocalDate.now().plusDays(2))).isEqualTo(new AuctionDate(LocalDate.now(), LocalDate.now().plusDays(2)));
    }
}
