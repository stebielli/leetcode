package it.bielli.leetcode.challenges.year2020.october;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/559/week-1-october-1st-october-7th/3480/
 */
public class Exercise1Test {

    private Exercise1.RecentCounter recentCounter;

    @BeforeEach
    void setUp() {
        this.recentCounter = new Exercise1.RecentCounter();
    }

    private void testCase(int[] pings, int[] expected) {
        int[] results = IntStream.of(pings)
                .map(recentCounter::ping).toArray();
        assertArrayEquals(expected, results);
    }

    @Test
    void test0() {
        int[] input = {1, 100, 3001, 3002};
        int[] expected = {1, 2, 3, 3};
        testCase(input, expected);
    }

    @Test
    void test1() {
        int[] input = {1};
        int[] expected = {1};
        testCase(input, expected);
    }

}