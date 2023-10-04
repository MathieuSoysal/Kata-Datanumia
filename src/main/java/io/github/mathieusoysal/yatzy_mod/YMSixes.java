package io.github.mathieusoysal.yatzy_mod;

import io.github.mathieusoysal.Dices;

class YMSixes implements YatzyModInterface {

    @Override
    public int calculateScore(Dices diceResults) {
        return YatzyModUtils.filterAndSum(6, diceResults);
    }

}
