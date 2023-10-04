package io.github.mathieusoysal.yatzy_mod;

import io.github.mathieusoysal.Dices;

class YMTwos implements YatzyModInterface {

    @Override
    public int calculateScore(Dices diceResults) {
        return YatzyModUtils.filterAndSum(2, diceResults);
    }

}
