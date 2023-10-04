package io.github.mathieusoysal.yatzy_mod;

import io.github.mathieusoysal.Dices;

class YMTwos implements YatzyModInterface {

    @Override
    public int calculate(Dices diceResults) {
        return YatzyModUtils.filterAndSum(2, diceResults);
    }

}
