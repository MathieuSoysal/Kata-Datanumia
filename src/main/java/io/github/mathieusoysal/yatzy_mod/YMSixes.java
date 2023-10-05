package io.github.mathieusoysal.yatzy_mod;

import io.github.mathieusoysal.Dices;

/**
 * The YMSixes class represents the "Sixes" category in the Yatzy game.
 * In the "Sixes" category, the player scores the sum of the dice that read six.
 */
class YMSixes implements YatzyModInterface {

    /**
     * Calculates the score for the "Sixes" category based on the sum of dice values
     * that read six.
     *
     * @param dices The set of dice to calculate the score for.
     * @return The calculated score, which is the sum of dice values that read six.
     */
    @Override
    public int calculateScore(Dices dices) {
        return YatzyModUtils.filterAndSum(6, dices);
    }
}
