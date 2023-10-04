package io.github.mathieusoysal.yatzy_mod;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import io.github.mathieusoysal.Dices;

class YatzyModUtils {

    private YatzyModUtils() {
        throw new IllegalStateException("Utility class");
    }

    static int filterAndSum(int diceNumber, Dices diceResults) {
        return diceResults.getDicesIntStream()
                .filter(d -> d == diceNumber)
                .sum();
    }

    static boolean isItEqualsWhenDicesIsSorted(Dices dices, List<Integer> toBeEquales) {
        return dices.getDicesIntStream()
                .sorted().boxed().toList()
                .equals(toBeEquales);
    }

    static IntStream filterByFrequency(int frequency, Dices dices) {
        Collection<Integer> diceCollection = dices.getDicesIntStream()
                .boxed().toList();
        return dices.getDicesIntStream()
                .filter(v -> Collections.frequency(diceCollection, v) >= frequency);
    }

    static boolean containsExactFrequencyDice(int frequency, Dices dices) {
        Collection<Integer> diceCollection = dices.getDicesIntStream()
                .boxed().toList();
        return dices.getDicesIntStream()
                .anyMatch(v -> Collections.frequency(diceCollection, v) == frequency);
    }
}
