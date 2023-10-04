package io.github.mathieusoysal.yatzy_mod;

import io.github.mathieusoysal.Dices;

class YMPair implements YatzyModInterface {

    @Override
    public int calculateScore(Dices dices) {
        return YatzyModUtils.filterByFrequency(2, dices)
                .max().orElse(0) * 2;
    }

}
