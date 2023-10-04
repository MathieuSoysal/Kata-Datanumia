package io.github.mathieusoysal.yatzy_mod;

import java.util.Collection;
import java.util.Collections;

import io.github.mathieusoysal.Dices;

class YMFullHouse implements YatzyModInterface {

    @Override
    public int calculate(Dices diceResults) {
        Collection<Integer> diceCollection = diceResults.getDicesIntStream()
                .boxed().toList();
        if (containsTriplet(diceResults, diceCollection) && containsPair(diceResults, diceCollection))
            return diceResults.getDicesIntStream().sum();
        else
            return 0;
    }

    private boolean containsPair(Dices diceResults, Collection<Integer> diceCollection) {
        return diceResults.getDicesIntStream()
                .anyMatch(v -> Collections.frequency(diceCollection, v) == 2);
    }

    private boolean containsTriplet(Dices diceResults, Collection<Integer> diceCollection) {
        return diceResults.getDicesIntStream()
                .anyMatch(v -> Collections.frequency(diceCollection, v) == 3);
    }

}
