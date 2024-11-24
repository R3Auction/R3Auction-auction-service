package com.r3a.auction.domain.auction;

import com.r3a.auction.domain.Point;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Auction {

    private final AuctionContents auctionContents;
    private final AuctionDate auctionDate;
    private final Product product;
    private final List<Bid> bids;
    private final int price;

    public Auction(AuctionContents auctionContents, AuctionDate auctionDate, Product product, int price) {
        this(auctionContents, auctionDate, product, new ArrayList<>(), price);
    }

    public Auction(AuctionContents auctionContents, AuctionDate auctionDate, Product product, List<Bid> bids, int price) {
        this.auctionContents = auctionContents;
        this.auctionDate = auctionDate;
        this.product = product;
        this.bids = bids;
        this.price = price;
    }

    public void addBid(Bid bid) {
        // 입찰 내역은 금액이 오름차순 이어야한다.
        this.bids.add(bid);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Auction auction)) return false;
        return Objects.equals(auctionContents, auction.auctionContents) && Objects.equals(auctionDate, auction.auctionDate) && Objects.equals(product, auction.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(auctionContents, auctionDate, product);
    }

}
