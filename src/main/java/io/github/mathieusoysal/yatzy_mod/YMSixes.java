package io.github.mathieusoysal.yatzy_mod;

import io.github.mathieusoysal.DiceResults;

class YMSixes implements YatzyModInterface {

    @Override
    public int calculate(DiceResults diceResults) {
        return YatzyModUtils.filterAndSum(6, diceResults);
    }

}
