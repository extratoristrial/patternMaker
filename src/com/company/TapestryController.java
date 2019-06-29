package com.company;

import java.util.ArrayList;

public class TapestryController {

    public static void main(String[] args) {

        CrossStitchWigglePattern crossStitchWigglePattern = new CrossStitchWigglePattern();
        BlockyBaublePattern blockyBaublePattern = new BlockyBaublePattern();
        ZigZagLinesPattern zigZagLinesPattern = new ZigZagLinesPattern();
        BaublePattern baublePattern = new BaublePattern();

        ArrayList<Pattern> patternList = new ArrayList<>();
        patternList.add(crossStitchWigglePattern);
        patternList.add(blockyBaublePattern);
        patternList.add(zigZagLinesPattern);
        patternList.add(baublePattern);


        makerLoop(patternList, 3, 8);
        spaceMaker();
        makerLoop(patternList, 8, 6);


    }

    public static void makerLoop(ArrayList<Pattern> patternList, int height, int width) {
        for (int patterns = 0; patterns < patternList.size(); patterns ++) {
            patternMaker(patternList.get(patterns), height, width);
        }
    }

    public static void spaceMaker() {
        System.out.println("\n"
                + "\n"
                + "\n");
    }

    public static void patternMaker(Pattern pattern, int height, int width) {
        for (int t = 0; t < height; t++) {
            for (int w = 0; w < width; w++) {
                pattern.printPattern();
            }         System.out.println("");
        }

    }
}
