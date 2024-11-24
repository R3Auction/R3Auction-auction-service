package com.r3a.auction.domain.auction;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AuctionContentsTest {

    static final AuctionContents chairContents = new AuctionContents("의자 팝니다!", "의자 1000원에 팔아요!", "대전");

    @Test
    void create() {
        Assertions.assertThat(new AuctionContents("의자 팝니다!", "의자 1000원에 팔아요!", "대전")).isEqualTo(new AuctionContents("의자 팝니다!", "의자 1000원에 팔아요!", "대전"));
    }
}
