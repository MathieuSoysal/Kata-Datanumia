package io.github.mathieusoysal.yatzy_mod;

import io.github.mathieusoysal.Dices;

class YMFourOfAKind implements YatzyModInterface {

    @Override
    public int calculateScore(Dices dices) {
        return YatzyModUtils.filterByFrequency(4, dices)
                .findAny().orElse(0) * 4;
    }

}
