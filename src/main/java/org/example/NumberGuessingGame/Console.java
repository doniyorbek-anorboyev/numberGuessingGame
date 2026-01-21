package org.example.NumberGuessingGame;

public class Console {
    private final InputHandler inputHandler = new InputHandler();
    private final NumberGenerator generator = new NumberGenerator();

    public void showWelcome() {
        System.out.println("Are you sure to find the number? :)");
        System.out.println("-----------------------------------\n");
    }

    public void start() {
        int min = inputHandler.getNumber("min");
        int max = inputHandler.getNumber("max");
        generator.generateNumber(min, max);
        System.out.println("Number is generated. Try to guess it!");
    }

    public void makeGuess() {
        GuessEvaluator guessEvaluator = new GuessEvaluator(generator, inputHandler);
        guessEvaluator.evaluateGuess();
    }
}