package io.github.mathieusoysal;

import java.util.stream.IntStream;

public class DiceResults {
    private IntStream dices;

    public DiceResults(int dice1, int dice2, int dice3, int dice4, int dice5) {
        dices = IntStream.of(dice1, dice2, dice3, dice4, dice5);
    }

    public IntStream getDices() {
        return dices;
    }
}
