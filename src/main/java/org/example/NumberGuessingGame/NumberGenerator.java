package org.example.NumberGuessingGame;

import java.util.Random;

public class NumberGenerator {
    private final Random random = new Random();
    public int generateNumber(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }
}
