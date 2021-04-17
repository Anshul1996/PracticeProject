package com.practice.immutability;

import java.util.Date;

public final class ImmutableClass {
final private int im1;

    public int getIm1() {
        return im1;
    }

    public String getIm2() {
        return im2;
    }

    public Date getIm3() {
        return im3;
    }

    final private String im2;
final private Date im3;

    public ImmutableClass(int im1, String im2, Date im3) {
        this.im1 = im1;
        this.im2 = im2;
        this.im3 = im3;
    }

}

