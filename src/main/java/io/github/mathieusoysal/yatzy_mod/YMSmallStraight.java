package io.github.mathieusoysal.yatzy_mod;

import java.util.List;

import io.github.mathieusoysal.DiceResults;

class YMSmallStraight implements YatzyModInterface {
    private static final List<Integer> SMALL_STRAIGHT_LIST = List.of(1, 2, 3, 4, 5);

    @Override
    public int calculate(DiceResults diceResults) {
        return diceResults.getDicesIntStream()
                .sorted().boxed().toList()
                .equals(SMALL_STRAIGHT_LIST) ? 15 : 0;
    }

}
