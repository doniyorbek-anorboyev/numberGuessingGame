package org.example.NumberGuessingGame;

import java.util.Random;

public class NumberGenerator {
    private final Random random = new Random();

    private int generatedNumber;
    public void generateNumber(int min, int max) {
        generatedNumber = random.nextInt(max - min + 1) + min;
    }

    public int getGeneratedNumber() {
        return generatedNumber;
    }
}
