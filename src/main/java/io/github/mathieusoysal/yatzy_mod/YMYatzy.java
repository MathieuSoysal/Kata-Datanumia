package io.github.mathieusoysal.yatzy_mod;

import io.github.mathieusoysal.Dices;

/**
 * The YMYatzy class represents the "Yatzy" category in the Yatzy game.
 * In the "Yatzy" category, the player scores 50 points if all dice have the
 * same number.
 */
class YMYatzy implements YatzyModInterface {

    /**
     * Calculates the score for the "Yatzy" category based on the condition that all
     * dice have the same number.
     *
     * @param dices The set of dice to calculate the score for.
     * @return The calculated score, which is 50 if all dice have the same number,
     *         or zero if not.
     */
    @Override
    public int calculateScore(Dices dices) {
        return dices.getDicesIntStream().distinct().count() == 1 ? 50 : 0;
    }
}
