package io.github.mathieusoysal.yatzy_mod;

import io.github.mathieusoysal.Dices;

public enum YatzyMod {
    CHANCE(new YMChance()),
    YATZY(new YMYatzy()),
    ONES(new YMOnes()),
    TWOS(new YMTwos()),
    THREES(new YMThrees()),
    FOURS(new YMFours()),
    FIVES(new YMFives()),
    SIXES(new YMSixes()),
    PAIR(new YMPair()),
    TWO_PAIRS(new YMTwoPairs()),
    THREE_OF_A_KIND(new YMThreeOfAKind()),
    FOUR_OF_A_KIND(new YMFourOfAKind()),
    SMALL_STRAIGHT(new YMSmallStraight()),
    LARGE_STRAIGHT(new YMLargeStraight()),
    FULL_HOUSE(new YMFullHouse());

    private YatzyModInterface mod;

    YatzyMod(YatzyModInterface mod) {
        this.mod = mod;
    }

    public int calculateScore(Dices dices) {
        return mod.calculateScore(dices);
    }
}
