package io.github.mathieusoysal.yatzy_mod;

import io.github.mathieusoysal.DiceResults;

class YatzyModUtils {

    static int filterAndSum(int diceNumber, DiceResults diceResults) {
        return diceResults.getDices()
                .filter(d -> d == diceNumber)
                .sum();
    }
}
