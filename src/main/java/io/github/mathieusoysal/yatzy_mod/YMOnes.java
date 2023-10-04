package io.github.mathieusoysal.yatzy_mod;

import io.github.mathieusoysal.DiceResults;

class YMOnes implements YatzyModInterface {

    @Override
    public int calculate(DiceResults diceResults) {
        return diceResults.getDices()
                .filter(i -> i == 1)
                .sum();
    }

}
