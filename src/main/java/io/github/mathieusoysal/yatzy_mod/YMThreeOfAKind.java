package io.github.mathieusoysal.yatzy_mod;

import java.util.Collection;
import java.util.Collections;

import io.github.mathieusoysal.Dices;

class YMThreeOfAKind implements YatzyModInterface {

    @Override
    public int calculate(Dices diceResults) {
        Collection<Integer> diceCollection = diceResults.getDicesIntStream()
                .boxed().toList();
        return diceResults.getDicesIntStream()
                .filter(v -> Collections.frequency(diceCollection, v) >= 3)
                .findAny().orElse(0) * 3;
    }

}
