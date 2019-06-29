package com.company;

public class ShortLineStitch extends Stitch {

    public void sew() {
        System.out.print("-");
    }

    public void doubleLine() {
        sew();
        sew();
    }

}
