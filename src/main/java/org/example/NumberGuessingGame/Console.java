package org.example.NumberGuessingGame;

public class Console {
    private final InputHandler inputHandler = new InputHandler();
    private final NumberGenerator generator = new NumberGenerator();

    public void showWelcome() {
        System.out.println("Are you sure to find the number? :)");
        System.out.println("-----------------------------------\n");
    }

    public void start() {
        int min, max;

        while (true) {
            min = inputHandler.getNumber("min");
            max = inputHandler.getNumber("max");

            if (min < max) {
                break;
            }
            System.out.println("Minimum must be less than maximum!");
        }

        generator.generateNumber(min, max);
        System.out.println("Number is generated. Try to guess it!");
    }



}
