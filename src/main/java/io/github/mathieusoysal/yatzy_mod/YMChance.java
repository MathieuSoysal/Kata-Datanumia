package io.github.mathieusoysal.yatzy_mod;

import io.github.mathieusoysal.DiceResults;

class YMChance implements YatzyModInterface {

    @Override
    public int calculate(DiceResults diceResults) {
        return diceResults.getDices().sum();
    }

}
