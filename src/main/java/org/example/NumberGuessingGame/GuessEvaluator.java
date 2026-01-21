package org.example.NumberGuessingGame;

public class GuessEvaluator {
    private final InputHandler inputHandler;
    private final NumberGenerator generator;

    public GuessEvaluator(NumberGenerator generator, InputHandler inputHandler) {
        this.generator = generator;
        this.inputHandler = inputHandler;
    }
    public void evaluateGuess() {
        int secret = generator.getGeneratedNumber();

        while (true) {
            int guess = inputHandler.getGuessedNumber();

            if (guess > secret) {
                System.out.println("Too high. Try a lower number.");
            } else if (guess < secret) {
                System.out.println("Too low. Try a higher number.");
            } else {
                System.out.println("Success. Hooray!");
                break;
            }
        }
    }
}
