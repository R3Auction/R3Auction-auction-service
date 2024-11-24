package com.r3a.auction.domain.auction;

import java.util.Objects;

public class AuctionContents {

    private final String title;
    private final String content;
    private final String returnAddress;

    public AuctionContents(String title, String content, String returnAddress) {
        this.title = title;
        this.content = content;
        this.returnAddress = returnAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AuctionContents that)) return false;
        return Objects.equals(title, that.title) && Objects.equals(content, that.content) && Objects.equals(returnAddress, that.returnAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, content, returnAddress);
    }
}
