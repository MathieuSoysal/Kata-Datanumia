package io.github.mathieusoysal.yatzy_mod;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import io.github.mathieusoysal.Dices;

class YMTwoPairs implements YatzyModInterface {

    @Override
    public int calculateScore(Dices diceResults) {
        Collection<Integer> diceCollection = diceResults.getDicesIntStream()
                .boxed().toList();
        List<Integer> pairs = diceResults.getDicesIntStream()
                .filter(v -> Collections.frequency(diceCollection, v) > 1)
                .distinct().boxed().toList();
        return pairs.size() == 2 ? (pairs.get(0) + pairs.get(1)) * 2 : 0;
    }

}
