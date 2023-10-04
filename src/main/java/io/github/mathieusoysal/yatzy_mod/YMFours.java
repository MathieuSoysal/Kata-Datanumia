package io.github.mathieusoysal.yatzy_mod;

import io.github.mathieusoysal.DiceResults;

class YMFours implements YatzyModInterface {

    @Override
    public int calculate(DiceResults diceResults) {
        return YatzyModUtils.filterAndSum(4, diceResults);
    }

}
