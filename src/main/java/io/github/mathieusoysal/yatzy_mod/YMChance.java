package io.github.mathieusoysal.yatzy_mod;

import io.github.mathieusoysal.Dices;

class YMChance implements YatzyModInterface {

    @Override
    public int calculateScore(Dices dices) {
        return dices.getDicesIntStream().sum();
    }

}
