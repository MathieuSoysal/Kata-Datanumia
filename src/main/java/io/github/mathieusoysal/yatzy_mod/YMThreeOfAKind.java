package io.github.mathieusoysal.yatzy_mod;

import io.github.mathieusoysal.Dices;

class YMThreeOfAKind implements YatzyModInterface {

    @Override
    public int calculateScore(Dices dices) {
        return YatzyModUtils.filterByFrequency(3, dices)
                .findAny().orElse(0) * 3;
    }

}
