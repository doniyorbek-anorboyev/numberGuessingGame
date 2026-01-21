package org.example;

import org.example.NumberGuessingGame.Console;

public class Main {
public static void main(String[] args) {
    Console console = new Console();
    console.showWelcome();
    console.start();
    console.makeGuess();
    }
}