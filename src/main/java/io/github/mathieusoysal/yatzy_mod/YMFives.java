package io.github.mathieusoysal.yatzy_mod;

import io.github.mathieusoysal.DiceResults;

class YMFives implements YatzyModInterface {

    @Override
    public int calculate(DiceResults diceResults) {
        return YatzyModUtils.filterAndSum(5, diceResults);
    }

}
