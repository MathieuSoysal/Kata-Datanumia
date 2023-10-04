package io.github.mathieusoysal;

import io.github.mathieusoysal.yatzy_mod.YatzyMod;

public class Yatzy {

    public static int chance(int d1, int d2, int d3, int d4, int d5) {
        DiceResults diceResults = new DiceResults(d1, d2, d3, d4, d5);
        return YatzyMod.CHANCE.calculate(diceResults);
    }

    public static int yatzy(int d1, int d2, int d3, int d4, int d5) {
        DiceResults diceResults = new DiceResults(d1, d2, d3, d4, d5);
        return YatzyMod.YATZY.calculate(diceResults);
    }

    public static int ones(int d1, int d2, int d3, int d4, int d5) {
        DiceResults diceResults = new DiceResults(d1, d2, d3, d4, d5);
        return YatzyMod.ONES.calculate(diceResults);
    }

    public static int twos(int d1, int d2, int d3, int d4, int d5) {
        DiceResults diceResults = new DiceResults(d1, d2, d3, d4, d5);
        return YatzyMod.TWOS.calculate(diceResults);
    }

    public static int threes(int d1, int d2, int d3, int d4, int d5) {
        DiceResults diceResults = new DiceResults(d1, d2, d3, d4, d5);
        return YatzyMod.THREES.calculate(diceResults);
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
        DiceResults diceResults = new DiceResults(dice[0], dice[1], dice[2], dice[3], dice[4]);
        return YatzyMod.FOURS.calculate(diceResults);
    }

    public int fives() {
        DiceResults diceResults = new DiceResults(dice[0], dice[1], dice[2], dice[3], dice[4]);
        return YatzyMod.FIVES.calculate(diceResults);
    }

    public int sixes() {
        DiceResults diceResults = new DiceResults(dice[0], dice[1], dice[2], dice[3], dice[4]);
        return YatzyMod.SIXES.calculate(diceResults);
    }

    public static int score_pair(int d1, int d2, int d3, int d4, int d5) {
        DiceResults diceResults = new DiceResults(d1, d2, d3, d4, d5);
        return YatzyMod.PAIR.calculate(diceResults);
    }

    public static int two_pair(int d1, int d2, int d3, int d4, int d5) {
        DiceResults diceResults = new DiceResults(d1, d2, d3, d4, d5);
        return YatzyMod.TWO_PAIRS.calculate(diceResults);
    }

    public static int four_of_a_kind(int d1, int d2, int d3, int d4, int d5) {
        DiceResults diceResults = new DiceResults(d1, d2, d3, d4, d5);
        return YatzyMod.FOUR_OF_A_KIND.calculate(diceResults);
    }

    public static int three_of_a_kind(int d1, int d2, int d3, int d4, int d5) {
        DiceResults diceResults = new DiceResults(d1, d2, d3, d4, d5);
        return YatzyMod.THREE_OF_A_KIND.calculate(diceResults);
    }

    public static int smallStraight(int d1, int d2, int d3, int d4, int d5) {
        int[] tallies;
        tallies = new int[6];
        tallies[d1 - 1] += 1;
        tallies[d2 - 1] += 1;
        tallies[d3 - 1] += 1;
        tallies[d4 - 1] += 1;
        tallies[d5 - 1] += 1;
        if (tallies[0] == 1 &&
                tallies[1] == 1 &&
                tallies[2] == 1 &&
                tallies[3] == 1 &&
                tallies[4] == 1)
            return 15;
        return 0;
    }

    public static int largeStraight(int d1, int d2, int d3, int d4, int d5) {
        int[] tallies;
        tallies = new int[6];
        tallies[d1 - 1] += 1;
        tallies[d2 - 1] += 1;
        tallies[d3 - 1] += 1;
        tallies[d4 - 1] += 1;
        tallies[d5 - 1] += 1;
        if (tallies[1] == 1 &&
                tallies[2] == 1 &&
                tallies[3] == 1 &&
                tallies[4] == 1
                && tallies[5] == 1)
            return 20;
        return 0;
    }

    public static int fullHouse(int d1, int d2, int d3, int d4, int d5) {
        int[] tallies;
        boolean _2 = false;
        int i;
        int _2_at = 0;
        boolean _3 = false;
        int _3_at = 0;

        tallies = new int[6];
        tallies[d1 - 1] += 1;
        tallies[d2 - 1] += 1;
        tallies[d3 - 1] += 1;
        tallies[d4 - 1] += 1;
        tallies[d5 - 1] += 1;

        for (i = 0; i != 6; i += 1)
            if (tallies[i] == 2) {
                _2 = true;
                _2_at = i + 1;
            }

        for (i = 0; i != 6; i += 1)
            if (tallies[i] == 3) {
                _3 = true;
                _3_at = i + 1;
            }

        if (_2 && _3)
            return _2_at * 2 + _3_at * 3;
        else
            return 0;
    }
}
