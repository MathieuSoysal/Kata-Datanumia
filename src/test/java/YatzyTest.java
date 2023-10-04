import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class YatzyTest {

    @ParameterizedTest
    @CsvSource(value = {
            "2 3 4 5 1 15",
            "3 3 4 5 1 16",
            "1 1 3 3 6 14",
            "4 5 5 6 1 21"
    }, delimiter = ' ')
    void chance_scores_sum_of_all_dice(int d1, int d2, int d3, int d4, int d5, int expected) {
        assertEquals(expected, Yatzy.chance(d1, d2, d3, d4, d5));
    }

    @ParameterizedTest
    @CsvSource(value = {
            "4 4 4 4 4 50",
            "1 1 1 1 1 50",
            "6 6 6 6 6 50",
            "1 1 1 2 1 0",
            "6 6 6 6 3 0"
    }, delimiter = ' ')
    void yatzy_scores_50(int d1, int d2, int d3, int d4, int d5, int expected) {
        assertEquals(expected, Yatzy.yatzy(d1, d2, d3, d4, d5));
    }

    @ParameterizedTest
    @CsvSource(value = {
            "1 2 3 4 5 1",
            "1 2 1 4 5 2",
            "6 2 2 4 5 0",
            "1 2 1 1 1 4",
            "3 3 3 4 5 0"
    }, delimiter = ' ')
    void test_1s(int d1, int d2, int d3, int d4, int d5, int expected) {
        assertEquals(expected, Yatzy.ones(d1, d2, d3, d4, d5));
    }

    @ParameterizedTest
    @CsvSource(value = {
            "1 2 3 2 6 4",
            "2 2 2 2 2 10",
            "2 3 2 5 1 4"
    }, delimiter = ' ')
    void test_2s(int d1, int d2, int d3, int d4, int d5, int expected) {
        assertEquals(expected, Yatzy.twos(d1, d2, d3, d4, d5));
    }

    @ParameterizedTest
    @CsvSource(value = {
            "1 2 3 2 3 6",
            "2 3 3 3 3 12"
    }, delimiter = ' ')
    void test_3s(int d1, int d2, int d3, int d4, int d5, int expected) {
        assertEquals(expected, Yatzy.threes(d1, d2, d3, d4, d5));
    }

    @ParameterizedTest
    @CsvSource(value = {
            "1 1 2 4 4 8",
            "4 4 4 5 5 12",
            "4 4 5 5 5 8",
            "4 5 5 5 5 4"
    }, delimiter = ' ')
    void test_4s(int d1, int d2, int d3, int d4, int d5, int expected) {
        assertEquals(expected, new Yatzy(d1, d2, d3, d4, d5).fours());
    }

    @ParameterizedTest
    @CsvSource(value = {
            "4 4 4 5 5 10",
            "4 4 5 5 5 15",
            "4 5 5 5 5 20"
    }, delimiter = ' ')
    void test_5s(int d1, int d2, int d3, int d4, int d5, int expected) {
        assertEquals(expected, new Yatzy(d1, d2, d3, d4, d5).fives());
    }

    @ParameterizedTest
    @CsvSource(value = {
            "4 4 4 5 5 0",
            "4 4 6 5 5 6",
            "6 5 6 6 5 18"
    }, delimiter = ' ')
    void test_6s(int d1, int d2, int d3, int d4, int d5, int expected) {
        assertEquals(expected, new Yatzy(d1, d2, d3, d4, d5).sixes());
    }

    @ParameterizedTest
    @CsvSource(value = {
            "1 2 3 4 5 0",
            "3 3 3 4 4 8",
            "1 1 6 2 6 12",
            "3 3 3 4 1 6",
            "3 3 3 3 1 6",
            "3 4 3 5 6 6",
            "5 3 3 3 5 10",
            "5 3 6 6 5 12"
    }, delimiter = ' ')
    void test_one_pair(int d1, int d2, int d3, int d4, int d5, int expected) {
        assertEquals(expected, Yatzy.score_pair(d1, d2, d3, d4, d5));
    }

    @Test
    void two_Pair() {
        assertEquals(16, Yatzy.two_pair(3, 3, 5, 4, 5));
        assertEquals(16, Yatzy.two_pair(3, 3, 5, 5, 5));
        assertEquals(8, Yatzy.two_pair(1, 1, 2, 3, 3));
        assertEquals(0, Yatzy.two_pair(1, 1, 2, 3, 4));
        assertEquals(6, Yatzy.two_pair(1, 1, 2, 2, 2));
        assertEquals(0, Yatzy.two_pair(3, 3, 3, 3, 1));
    }

    @Test
    void three_of_a_kind() {
        assertEquals(9, Yatzy.three_of_a_kind(3, 3, 3, 4, 5));
        assertEquals(15, Yatzy.three_of_a_kind(5, 3, 5, 4, 5));
        assertEquals(9, Yatzy.three_of_a_kind(3, 3, 3, 3, 5));
        assertEquals(0, Yatzy.three_of_a_kind(3, 3, 4, 5, 6));
        assertEquals(9, Yatzy.three_of_a_kind(3, 3, 3, 3, 1));
    }

    @Test
    void four_of_a_kind() {
        assertEquals(12, Yatzy.four_of_a_kind(3, 3, 3, 3, 5));
        assertEquals(20, Yatzy.four_of_a_kind(5, 5, 5, 4, 5));
        assertEquals(12, Yatzy.four_of_a_kind(3, 3, 3, 3, 3));
        assertEquals(8, Yatzy.four_of_a_kind(2, 2, 2, 2, 5));
        assertEquals(0, Yatzy.four_of_a_kind(2, 2, 2, 5, 5));
        assertEquals(8, Yatzy.four_of_a_kind(2, 2, 2, 2, 2));
    }

    @Test
    void smallStraight() {
        assertEquals(15, Yatzy.smallStraight(1, 2, 3, 4, 5));
        assertEquals(15, Yatzy.smallStraight(2, 3, 4, 5, 1));
        assertEquals(0, Yatzy.smallStraight(1, 2, 2, 4, 5));
    }

    @Test
    void largeStraight() {
        assertEquals(20, Yatzy.largeStraight(6, 2, 3, 4, 5));
        assertEquals(20, Yatzy.largeStraight(2, 3, 4, 5, 6));
        assertEquals(0, Yatzy.largeStraight(1, 2, 2, 4, 5));
    }

    @Test
    void fullHouse() {
        assertEquals(18, Yatzy.fullHouse(6, 2, 2, 2, 6));
        assertEquals(0, Yatzy.fullHouse(2, 3, 4, 5, 6));
        assertEquals(8, Yatzy.fullHouse(1, 1, 2, 2, 2));
        assertEquals(0, Yatzy.fullHouse(2, 2, 3, 3, 4));
        assertEquals(0, Yatzy.fullHouse(4, 4, 4, 4, 4));
    }
}
