package com.r3a.auction.domain;

import java.util.Objects;

public class Point {
    public static final String CREATE_EXCEPTION_MESSAGE = "포인트는 0 이상 이어야 합니다.";
    public static final int MIN_VALUE = 0;

    private int point;

    public Point(int point) {
        if (point < MIN_VALUE) {
            throw new IllegalArgumentException(CREATE_EXCEPTION_MESSAGE);
        }
        this.point = point;
    }

    public void charge(int point) {
        this.point += point;
    }

    public void decrease(int price) {
        if (point < price) {
            throw new IllegalArgumentException("보유머니가 부족합니다!");
        }
        point -= price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point point1)) return false;
        return point == point1.point;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(point);
    }

}
