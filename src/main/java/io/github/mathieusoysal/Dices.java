package io.github.mathieusoysal;

import java.util.stream.IntStream;

public class Dices {
    private int[] dicesArray;

    public Dices(int dice1, int dice2, int dice3, int dice4, int dice5) {
        dicesArray = new int[] { dice1, dice2, dice3, dice4, dice5 };
    }

    public IntStream getDicesIntStream() {
        return IntStream.of(dicesArray);
    }
}
