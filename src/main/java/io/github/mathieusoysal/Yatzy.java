package io.github.mathieusoysal;

import io.github.mathieusoysal.yatzy_mod.YatzyMod;

public class Yatzy {

    public static int calculateScore(YatzyMod mod, Dices dices) {
        return mod.calculateScore(dices);
    }

    public static int chance(Dices dices) {
        return calculateScore(YatzyMod.CHANCE, dices);
    }

    public static int yatzy(Dices dices) {
        return calculateScore(YatzyMod.YATZY, dices);
    }

    public static int ones(Dices dices) {
        return calculateScore(YatzyMod.ONES, dices);
    }

    public static int twos(Dices dices) {
        return calculateScore(YatzyMod.TWOS, dices);
    }

    public static int threes(Dices dices) {
        return calculateScore(YatzyMod.THREES, dices);
    }

    public static int fours(Dices dices) {
        return calculateScore(YatzyMod.FOURS, dices);
    }

    public static int fives(Dices dices) {
        return calculateScore(YatzyMod.FIVES, dices);
    }

    public static int sixes(Dices dices) {
        return calculateScore(YatzyMod.SIXES, dices);
    }

    public static int pair(Dices dices) {
        return calculateScore(YatzyMod.PAIR, dices);
    }

    public static int twoPairs(Dices dices) {
        return calculateScore(YatzyMod.TWO_PAIRS, dices);
    }

    public static int fourOfAKind(Dices dices) {
        return calculateScore(YatzyMod.FOUR_OF_A_KIND, dices);
    }

    public static int threeOfAKind(Dices dices) {
        return calculateScore(YatzyMod.THREE_OF_A_KIND, dices);
    }

    public static int smallStraight(Dices dices) {
        return calculateScore(YatzyMod.SMALL_STRAIGHT, dices);
    }

    public static int largeStraight(Dices dices) {
        return calculateScore(YatzyMod.LARGE_STRAIGHT, dices);
    }

    public static int fullHouse(Dices dices) {
        return calculateScore(YatzyMod.FULL_HOUSE, dices);
    }
}
