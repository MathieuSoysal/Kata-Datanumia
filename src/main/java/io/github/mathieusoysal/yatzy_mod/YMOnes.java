package io.github.mathieusoysal.yatzy_mod;

import io.github.mathieusoysal.DiceResults;

class YMOnes implements YatzyModInterface {

    @Override
    public int calculate(DiceResults diceResults) {
        return YatzyModUtils.filterAndSum(1, diceResults);
    }

}
