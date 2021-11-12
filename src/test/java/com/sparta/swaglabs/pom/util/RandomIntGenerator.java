package com.sparta.swaglabs.pom.util;

import java.util.Random;

public class RandomIntGenerator {

    public static int generate(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

    public static int generate(int min, int max, long seed) {
        Random random = new Random(seed);
        return random.nextInt(max - min) + min;
    }

}
