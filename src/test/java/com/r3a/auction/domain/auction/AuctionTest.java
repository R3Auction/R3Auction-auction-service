package com.r3a.auction.domain.auction;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AuctionTest {

    static final Auction chairAuction = new Auction(AuctionContentsTest.chairContents, AuctionDateTest.date, ProductTest.chair, 1000);

    @Test
    void create() {
        assertThat(new Auction(AuctionContentsTest.chairContents, AuctionDateTest.date, ProductTest.chair, 1000)).isEqualTo(new Auction(AuctionContentsTest.chairContents, AuctionDateTest.date, ProductTest.chair, 1000));
    }
}
