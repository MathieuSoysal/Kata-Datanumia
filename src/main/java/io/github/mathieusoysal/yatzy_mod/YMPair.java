package io.github.mathieusoysal.yatzy_mod;

import io.github.mathieusoysal.Dices;

/**
 * The YMPair class represents the "Pair" category in the Yatzy game.
 * In the "Pair" category, the player scores the sum of the two highest matching
 * dice values.
 */
class YMPair implements YatzyModInterface {

    /**
     * Calculates the score for the "Pair" category based on the sum of the two
     * highest matching dice values.
     *
     * @param dices The set of dice to calculate the score for.
     * @return The calculated score, which is the sum of the two highest matching
     *         dice values or zero if not possible.
     */
    @Override
    public int calculateScore(Dices dices) {
        return YatzyModUtils.filterByFrequency(2, dices)
                .max()
                .orElse(0) * 2;
    }
}
