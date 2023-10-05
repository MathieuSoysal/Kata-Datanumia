package io.github.mathieusoysal;

import java.util.stream.IntStream;

import io.github.mathieusoysal.exception.IncorrectDiceValueException;

public class Dices {
    private int[] dicesArray;

    public Dices(int dice1, int dice2, int dice3, int dice4, int dice5) {
        dicesArray = new int[] { dice1, dice2, dice3, dice4, dice5 };
        for (int diceValue : dicesArray)
            checkDiceValue(diceValue);
    }

    private void checkDiceValue(int diceValue) {
        if (diceValue < 1 || diceValue > 6)
            throw new IncorrectDiceValueException();
    }

    public IntStream getDicesIntStream() {
        return IntStream.of(dicesArray);
    }
}
