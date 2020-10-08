package it.bielli.leetcode.challenges.year2020.october.week1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/559/week-1-october-1st-october-7th/3484/
 */
class Exercise5Test {

    private Exercise5 ex;

    @BeforeEach
    void setUp() {
        ex = new Exercise5();
    }

    private void testCase(int input, int output) {
        assertEquals(output, ex.bitwiseComplement(input));
    }

    @Test
    void test1() {
        int input = 0;
        int output = 1;
        testCase(input, output);
    }

    @Test
    void test2() {
        int input = 5;
        int output = 2;
        testCase(input, output);
    }

    @Test
    void test3() {
        int input = 7;
        int output = 0;
        testCase(input, output);
    }

    @Test
    void test4() {
        int input = 10;
        int output = 5;
        testCase(input, output);
    }

}