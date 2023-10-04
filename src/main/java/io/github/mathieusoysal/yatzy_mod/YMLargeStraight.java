package io.github.mathieusoysal.yatzy_mod;

import static io.github.mathieusoysal.yatzy_mod.YatzyModUtils.isItEqualsWhenDicesIsSorted;

import java.util.List;

import io.github.mathieusoysal.Dices;

class YMLargeStraight implements YatzyModInterface {
    private static final List<Integer> LARGE_STRAIGHT_LIST = List.of(2, 3, 4, 5, 6);

    @Override
    public int calculateScore(Dices dices) {
        return isItEqualsWhenDicesIsSorted(dices, LARGE_STRAIGHT_LIST) ? 20 : 0;
    }

}
