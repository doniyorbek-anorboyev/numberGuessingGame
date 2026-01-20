package org.example.NumberGuessingGame;

import java.util.Scanner;

public class Player {
    private final Scanner scanner = new Scanner(System.in);
    public int makeGuess() {
        int number;
        while(true) {
            System.out.print("Guess the number: ");
            if(scanner.hasNextInt()) {
                number = scanner.nextInt();
                return number;
            } else {
                scanner.next();
                System.out.println("Invalid input. Please enter a number!");
            }
        }
    }

}
