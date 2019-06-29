package com.company;

public class BlockyBaublePattern extends Pattern {

    BlockStitch block = new BlockStitch();
    CircleStitch circle = new CircleStitch();
    ShortLineStitch line = new ShortLineStitch();

    public void printPattern() {
        for (int i = 0; i < 3; i++) {
            block.sew();
            line.doubleLine();
            circle.sew();
            line.doubleLine();
        }
    }
}
