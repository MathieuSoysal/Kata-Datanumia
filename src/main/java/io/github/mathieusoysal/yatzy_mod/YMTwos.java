package io.github.mathieusoysal.yatzy_mod;

import io.github.mathieusoysal.Dices;

/**
 * The YMTwos class represents the "Twos" category in the Yatzy game.
 * In the "Twos" category, the player scores the sum of the dice that read two.
 */
class YMTwos implements YatzyModInterface {

    /**
     * Calculates the score for the "Twos" category based on the sum of dice values
     * that read two.
     *
     * @param dices The set of dice to calculate the score for.
     * @return The calculated score, which is the sum of dice values that read two.
     */
    @Override
    public int calculateScore(Dices dices) {
        return YatzyModUtils.filterAndSum(2, dices);
    }
}
