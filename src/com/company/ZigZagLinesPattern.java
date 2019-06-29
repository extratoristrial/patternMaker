package com.company;

public class ZigZagLinesPattern extends Pattern {

    ZigZagStitch zig = new ZigZagStitch();
    FillStitch fill = new FillStitch();

    public void printPattern() {

        for (int i = 0; i < 2; i++) {
            for (int z = 0; z < 3; z++) {
                zig.sew();
            }
            for (int f = 0; f < 3; f++) {
                fill.sew();
            }
        }

    }
}
