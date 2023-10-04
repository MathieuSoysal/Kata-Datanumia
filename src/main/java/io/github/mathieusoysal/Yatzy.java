package io.github.mathieusoysal;

import io.github.mathieusoysal.yatzy_mod.YatzyMod;

public class Yatzy {

    public static int calculateScore(YatzyMod mod, Dices dices) {
        return mod.calculateScore(dices);
    }

    public static int chance(int d1, int d2, int d3, int d4, int d5) {
        return calculateScore(YatzyMod.CHANCE, new Dices(d1, d2, d3, d4, d5));
    }

    public static int yatzy(int d1, int d2, int d3, int d4, int d5) {
        return calculateScore(YatzyMod.YATZY, new Dices(d1, d2, d3, d4, d5));
    }

    public static int ones(int d1, int d2, int d3, int d4, int d5) {
        return calculateScore(YatzyMod.ONES, new Dices(d1, d2, d3, d4, d5));
    }

    public static int twos(int d1, int d2, int d3, int d4, int d5) {
        return calculateScore(YatzyMod.TWOS, new Dices(d1, d2, d3, d4, d5));
    }

    public static int threes(int d1, int d2, int d3, int d4, int d5) {
        return calculateScore(YatzyMod.THREES, new Dices(d1, d2, d3, d4, d5));
    }

    public static int fours(int d1, int d2, int d3, int d4, int d5) {
        return calculateScore(YatzyMod.FOURS, new Dices(d1, d2, d3, d4, d5));
    }

    public static int fives(int d1, int d2, int d3, int d4, int d5) {
        return calculateScore(YatzyMod.FIVES, new Dices(d1, d2, d3, d4, d5));
    }

    public static int sixes(int d1, int d2, int d3, int d4, int d5) {
        return calculateScore(YatzyMod.SIXES, new Dices(d1, d2, d3, d4, d5));
    }

    public static int pair(int d1, int d2, int d3, int d4, int d5) {
        return calculateScore(YatzyMod.PAIR, new Dices(d1, d2, d3, d4, d5));
    }

    public static int twoPairs(int d1, int d2, int d3, int d4, int d5) {
        return calculateScore(YatzyMod.TWO_PAIRS, new Dices(d1, d2, d3, d4, d5));
    }

    public static int fourOfAKind(int d1, int d2, int d3, int d4, int d5) {
        return calculateScore(YatzyMod.FOUR_OF_A_KIND, new Dices(d1, d2, d3, d4, d5));
    }

    public static int threeOfAKind(int d1, int d2, int d3, int d4, int d5) {
        return calculateScore(YatzyMod.THREE_OF_A_KIND, new Dices(d1, d2, d3, d4, d5));
    }

    public static int smallStraight(int d1, int d2, int d3, int d4, int d5) {
        return calculateScore(YatzyMod.SMALL_STRAIGHT, new Dices(d1, d2, d3, d4, d5));
    }

    public static int largeStraight(int d1, int d2, int d3, int d4, int d5) {
        return calculateScore(YatzyMod.LARGE_STRAIGHT, new Dices(d1, d2, d3, d4, d5));
    }

    public static int fullHouse(int d1, int d2, int d3, int d4, int d5) {
        return calculateScore(YatzyMod.FULL_HOUSE, new Dices(d1, d2, d3, d4, d5));
    }
}
