package io.github.mathieusoysal.yatzy_mod;

import io.github.mathieusoysal.Dices;

/**
 * The YMThrees class represents the "Threes" category in the Yatzy game.
 * In the "Threes" category, the player scores the sum of the dice that read
 * three.
 */
class YMThrees implements YatzyModInterface {

    /**
     * Calculates the score for the "Threes" category based on the sum of dice
     * values that read three.
     *
     * @param dices The set of dice to calculate the score for.
     * @return The calculated score, which is the sum of dice values that read
     *         three.
     */
    @Override
    public int calculateScore(Dices dices) {
        return YatzyModUtils.filterAndSum(3, dices);
    }
}
