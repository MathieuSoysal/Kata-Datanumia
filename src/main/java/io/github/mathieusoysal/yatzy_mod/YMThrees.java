package io.github.mathieusoysal.yatzy_mod;

import io.github.mathieusoysal.Dices;

class YMThrees implements YatzyModInterface {

    @Override
    public int calculate(Dices diceResults) {
        return YatzyModUtils.filterAndSum(3, diceResults);
    }

}
