package io.github.mathieusoysal.yatzy_mod;

import io.github.mathieusoysal.Dices;

/**
 * The YMFives class represents the "Fives" category in the Yatzy game.
 * In the "Fives" category, the player scores the sum of the dice that read
 * five.
 */
class YMFives implements YatzyModInterface {

    /**
     * Calculates the score for the "Fives" category based on the sum of dice values
     * that read five.
     *
     * @param dices The set of dice to calculate the score for.
     * @return The calculated score, which is the sum of dice values that read five.
     */
    @Override
    public int calculateScore(Dices dices) {
        return YatzyModUtils.filterAndSum(5, dices);
    }
}
