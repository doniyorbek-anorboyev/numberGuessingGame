package org.example.NumberGuessingGame;

import java.util.Scanner;

public class InputHandler {
    private final Scanner scanner = new Scanner(System.in);


    public int getNumber(String prompt) {
        while(true) {
            System.out.print("Enter the range for " + prompt + ": ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number >= 0 && number <= 100) {
                    return number;
                } else {
                    System.out.println("Number must be between 0 and 100!");
                    continue;
                }
            } else {
                scanner.next();
                System.out.println("Invalid input. Please enter a number!");
            }
        }
    }

    public int getGuessedNumber() {
        while(true) {
            System.out.print("Enter your guess: ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number >= 0 && number <= 100) {
                    return number;
                } else {
                    System.out.println("Number must be between 0 and 100!");
                    continue;
                }
            } else {
                scanner.next();
                System.out.println("Invalid input. Please enter a number!");
            }
        }
    }
}
