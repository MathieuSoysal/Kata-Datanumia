package io.github.mathieusoysal.yatzy_mod;

import io.github.mathieusoysal.Dices;

class YMOnes implements YatzyModInterface {

    @Override
    public int calculate(Dices diceResults) {
        return YatzyModUtils.filterAndSum(1, diceResults);
    }

}
