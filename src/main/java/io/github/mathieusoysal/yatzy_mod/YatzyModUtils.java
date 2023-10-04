package io.github.mathieusoysal.yatzy_mod;

import io.github.mathieusoysal.Dices;

class YatzyModUtils {

    private YatzyModUtils() {
        throw new IllegalStateException("Utility class");
    }

    static int filterAndSum(int diceNumber, Dices diceResults) {
        return diceResults.getDicesIntStream()
                .filter(d -> d == diceNumber)
                .sum();
    }
}
