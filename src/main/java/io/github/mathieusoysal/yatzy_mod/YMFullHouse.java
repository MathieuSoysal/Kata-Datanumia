package io.github.mathieusoysal.yatzy_mod;

import io.github.mathieusoysal.Dices;

class YMFullHouse implements YatzyModInterface {

    @Override
    public int calculateScore(Dices dices) {
        if (containsTriplet(dices) && containsPair(dices))
            return dices.getDicesIntStream().sum();
        else
            return 0;
    }

    private boolean containsPair(Dices dices) {
        return YatzyModUtils.containsExactFrequencyDice(2, dices);
    }

    private boolean containsTriplet(Dices dices) {
        return YatzyModUtils.containsExactFrequencyDice(3, dices);
    }

}
