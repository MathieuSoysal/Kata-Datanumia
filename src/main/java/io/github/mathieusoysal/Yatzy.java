package io.github.mathieusoysal;

import io.github.mathieusoysal.yatzy_mod.YatzyMod;

public class Yatzy {

    public static int calculateScore(YatzyMod mod, Dices dices) {
        return mod.calculateScore(dices);
    }

    public static int chance(int d1, int d2, int d3, int d4, int d5) {
        Dices diceResults = new Dices(d1, d2, d3, d4, d5);
        return YatzyMod.CHANCE.calculateScore(diceResults);
    }

    public static int yatzy(int d1, int d2, int d3, int d4, int d5) {
        Dices diceResults = new Dices(d1, d2, d3, d4, d5);
        return YatzyMod.YATZY.calculateScore(diceResults);
    }

    public static int ones(int d1, int d2, int d3, int d4, int d5) {
        Dices diceResults = new Dices(d1, d2, d3, d4, d5);
        return YatzyMod.ONES.calculateScore(diceResults);
    }

    public static int twos(int d1, int d2, int d3, int d4, int d5) {
        Dices diceResults = new Dices(d1, d2, d3, d4, d5);
        return YatzyMod.TWOS.calculateScore(diceResults);
    }

    public static int threes(int d1, int d2, int d3, int d4, int d5) {
        Dices diceResults = new Dices(d1, d2, d3, d4, d5);
        return YatzyMod.THREES.calculateScore(diceResults);
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

    public static int score_pair(int d1, int d2, int d3, int d4, int d5) {
        Dices diceResults = new Dices(d1, d2, d3, d4, d5);
        return YatzyMod.PAIR.calculateScore(diceResults);
    }

    public static int two_pair(int d1, int d2, int d3, int d4, int d5) {
        Dices diceResults = new Dices(d1, d2, d3, d4, d5);
        return YatzyMod.TWO_PAIRS.calculateScore(diceResults);
    }

    public static int four_of_a_kind(int d1, int d2, int d3, int d4, int d5) {
        Dices diceResults = new Dices(d1, d2, d3, d4, d5);
        return YatzyMod.FOUR_OF_A_KIND.calculateScore(diceResults);
    }

    public static int three_of_a_kind(int d1, int d2, int d3, int d4, int d5) {
        Dices diceResults = new Dices(d1, d2, d3, d4, d5);
        return YatzyMod.THREE_OF_A_KIND.calculateScore(diceResults);
    }

    public static int smallStraight(int d1, int d2, int d3, int d4, int d5) {
        Dices diceResults = new Dices(d1, d2, d3, d4, d5);
        return YatzyMod.SMALL_STRAIGHT.calculateScore(diceResults);
    }

    public static int largeStraight(int d1, int d2, int d3, int d4, int d5) {
        Dices diceResults = new Dices(d1, d2, d3, d4, d5);
        return YatzyMod.LARGE_STRAIGHT.calculateScore(diceResults);

    }

    public static int fullHouse(int d1, int d2, int d3, int d4, int d5) {
        Dices diceResults = new Dices(d1, d2, d3, d4, d5);
        return YatzyMod.FULL_HOUSE.calculateScore(diceResults);
    }
}
