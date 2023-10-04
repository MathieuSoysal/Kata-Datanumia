package io.github.mathieusoysal;

import java.util.stream.IntStream;

public class DiceResults {
    private int[] dices;

    public DiceResults(int dice1, int dice2, int dice3, int dice4, int dice5) {
        dices = new int[] { dice1, dice2, dice3, dice4, dice5 };
    }

    public IntStream getDicesIntStream() {
        return IntStream.of(dices);
    }
}
