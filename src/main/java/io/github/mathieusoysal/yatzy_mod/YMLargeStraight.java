package io.github.mathieusoysal.yatzy_mod;

import java.util.List;

import io.github.mathieusoysal.Dices;

class YMLargeStraight implements YatzyModInterface {
    private static final List<Integer> LARGE_STRAIGHT_LIST = List.of(2, 3, 4, 5, 6);

    @Override
    public int calculate(Dices diceResults) {
        return diceResults.getDicesIntStream()
                .sorted().boxed().toList()
                .equals(LARGE_STRAIGHT_LIST) ? 20 : 0;
    }

}
