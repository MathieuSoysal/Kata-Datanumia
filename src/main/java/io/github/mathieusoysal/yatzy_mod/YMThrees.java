package io.github.mathieusoysal.yatzy_mod;

import io.github.mathieusoysal.DiceResults;

class YMThrees implements YatzyModInterface {

    @Override
    public int calculate(DiceResults diceResults) {
        return YatzyModUtils.filterAndSum(3, diceResults);
    }

}
