package io.github.mathieusoysal;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import com.code_intelligence.jazzer.api.FuzzedDataProvider;
import com.code_intelligence.jazzer.junit.FuzzTest;

import io.github.mathieusoysal.yatzy_mod.YatzyMod;

class FuzzingTest {

    @FuzzTest
    void test_doesNotthrowsIncorrectDiceValue_withGoodValue(FuzzedDataProvider data) {
        int d1 = data.consumeInt(1, 6);
        int d2 = data.consumeInt(1, 6);
        int d3 = data.consumeInt(1, 6);
        int d4 = data.consumeInt(1, 6);
        int d5 = data.consumeInt(1, 6);
        assertDoesNotThrow(() -> new Dices(d1, d2, d3, d4, d5));
    }

    @FuzzTest
    void test_calculateScore_withNotNullDices(FuzzedDataProvider data) {
        YatzyMod mod = YatzyMod.values()[data.consumeInt(0, YatzyMod.values().length - 1)];
        int d1 = data.consumeInt(1, 6);
        int d2 = data.consumeInt(1, 6);
        int d3 = data.consumeInt(1, 6);
        int d4 = data.consumeInt(1, 6);
        int d5 = data.consumeInt(1, 6);
        assertDoesNotThrow(() -> mod.calculateScore(new Dices(d1, d2, d3, d4, d5)));
    }
}
