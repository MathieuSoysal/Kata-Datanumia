package io.github.mathieusoysal.yatzy_mod;

import io.github.mathieusoysal.Dices;

/**
 * The YMFours class represents the "Fours" category in the Yatzy game.
 * In the "Fours" category, the player scores the sum of the dice that read
 * four.
 */
class YMFours implements YatzyModInterface {

    /**
     * Calculates the score for the "Fours" category based on the sum of dice values
     * that read four.
     *
     * @param dices The set of dice to calculate the score for.
     * @return The calculated score, which is the sum of dice values that read four.
     */
    @Override
    public int calculateScore(Dices dices) {
        return YatzyModUtils.filterAndSum(4, dices);
    }
}
