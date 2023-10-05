package io.github.mathieusoysal.yatzy_mod;

import io.github.mathieusoysal.Dices;

/**
 * The YMTwoPairs class represents the "Two Pairs" category in the Yatzy game.
 * In the "Two Pairs" category, the player scores the sum of the two highest
 * matching dice pairs.
 */
class YMTwoPairs implements YatzyModInterface {

    /**
     * Calculates the score for the "Two Pairs" category based on the sum of the two
     * highest matching dice pairs.
     *
     * @param dices The set of dice to calculate the score for.
     * @return The calculated score, which is the sum of the two highest matching
     *         dice pairs or zero if not possible.
     */
    @Override
    public int calculateScore(Dices dices) {
        if (numberOfPair(dices) == 2)
            return YatzyModUtils.filterByFrequency(2, dices).distinct().sum() * 2;
        else
            return 0;
    }

    /**
     * Counts the number of distinct pairs in the given set of dice.
     *
     * @param dices The set of dice to count pairs from.
     * @return The number of distinct pairs found in the dice set.
     */
    private int numberOfPair(Dices dices) {
        return (int) YatzyModUtils.filterByFrequency(2, dices).distinct().count();
    }
}
