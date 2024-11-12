package com.r3a.auction;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;


public class PointTest {

    @Test
    void create() {
        Point point = new Point(1000);

        assertThat(point).isEqualTo(new Point(1000));
    }

    @Test
    void 유효성검증() {
        assertThatThrownBy(() -> {
            Point point = new Point(-10000);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 충전() {
        Point point = new Point(1000);

        Point expected = point.charge(10000);

        assertThat(expected).isEqualTo(new Point(11000));
    }



}
