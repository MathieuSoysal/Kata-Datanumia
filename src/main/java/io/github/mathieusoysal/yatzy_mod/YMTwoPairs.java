package io.github.mathieusoysal.yatzy_mod;

import io.github.mathieusoysal.Dices;

class YMTwoPairs implements YatzyModInterface {

    @Override
    public int calculateScore(Dices dices) {
        if (numberOfPair(dices) == 2)
            return YatzyModUtils.filterByFrequency(2, dices).distinct().sum() * 2;
        else
            return 0;
    }

    private int numberOfPair(Dices dices) {
        return (int) YatzyModUtils.filterByFrequency(2, dices).distinct().count();
    }

}
