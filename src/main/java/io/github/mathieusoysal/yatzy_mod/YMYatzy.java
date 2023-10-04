package io.github.mathieusoysal.yatzy_mod;

import io.github.mathieusoysal.Dices;

class YMYatzy implements YatzyModInterface {

    @Override
    public int calculateScore(Dices diceResults) {
        return diceResults.getDicesIntStream().distinct().count() == 1 ? 50 : 0;
    }

}
