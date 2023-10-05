package io.github.mathieusoysal.exception;

public class IncorrectDiceValueException extends IllegalArgumentException {

    public IncorrectDiceValueException() {
        super("Incorrect dice value. Dice value must be between 1 and 6.");
    }

}
