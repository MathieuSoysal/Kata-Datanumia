package io.github.mathieusoysal.yatzy_mod;

import io.github.mathieusoysal.DiceResults;

class YMYatzy implements YatzyModInterface {

    @Override
    public int calculate(DiceResults diceResults) {
        return diceResults.getDices().distinct().count() == 1 ? 50 : 0;
    }

}
