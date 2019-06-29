package com.company;

public class CrossStitchWigglePattern extends Pattern {

    LargeCrossStitch large = new LargeCrossStitch();
    SmallCrossStitch small = new SmallCrossStitch();

    public void printPattern() {
        for (int i = 0; i < 5; i ++) {
            small.sew();
            large.sew();
        }
    }
}
