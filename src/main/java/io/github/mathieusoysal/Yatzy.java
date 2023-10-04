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

    protected int[] dice;

    public Yatzy(int d1, int d2, int d3, int d4, int _5) {
        dice = new int[5];
        dice[0] = d1;
        dice[1] = d2;
        dice[2] = d3;
        dice[3] = d4;
        dice[4] = _5;
    }

    public int fours() {
        Dices diceResults = new Dices(dice[0], dice[1], dice[2], dice[3], dice[4]);
        return YatzyMod.FOURS.calculateScore(diceResults);
    }

    public int fives() {
        Dices diceResults = new Dices(dice[0], dice[1], dice[2], dice[3], dice[4]);
        return YatzyMod.FIVES.calculateScore(diceResults);
    }

    public int sixes() {
        Dices diceResults = new Dices(dice[0], dice[1], dice[2], dice[3], dice[4]);
        return YatzyMod.SIXES.calculateScore(diceResults);
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
