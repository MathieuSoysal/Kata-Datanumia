package io.github.mathieusoysal.yatzy_mod;

import io.github.mathieusoysal.DiceResults;

class YatzyModUtils {

    private YatzyModUtils() {
        throw new IllegalStateException("Utility class");
    }

    static int filterAndSum(int diceNumber, DiceResults diceResults) {
        return diceResults.getDicesIntStream()
                .filter(d -> d == diceNumber)
                .sum();
    }
}
