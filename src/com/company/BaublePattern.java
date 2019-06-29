package com.company;

public class BaublePattern extends Pattern {

    CircleStitch circle = new CircleStitch();
    ShortLineStitch line = new ShortLineStitch();

    public void printPattern() {
        for (int i = 0; i < 5; i++) {
            line.doubleLine();
            circle.sew();
        }
    }

    }
