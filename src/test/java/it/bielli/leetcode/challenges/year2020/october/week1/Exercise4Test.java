package it.bielli.leetcode.challenges.year2020.october.week1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/559/week-1-october-1st-october-7th/3483/
 */
class Exercise4Test {

    private Exercise4 ex;

    @BeforeEach
    void setUp() {
        ex = new Exercise4();
    }

    private void testCase(int[][] intervals, int output) {
        assertEquals(output, ex.removeCoveredIntervals(intervals));
    }

    @Test
    void test1() {
        int[][] intervals = {};
        int output = 0;
        testCase(intervals, output);
    }

    @Test
    void test2() {
        int[][] intervals = {{1, 1}};
        int output = 1;
        testCase(intervals, output);
    }

    @Test
    void test3() {
        int[][] intervals = {{1, 1}, {1, 1}};
        int output = 1;
        testCase(intervals, output);
    }

    @Test
    void test4() {
        int[][] intervals = {{0, 2}, {1, 1}};
        int output = 1;
        testCase(intervals, output);
    }

    @Test
    void test5() {
        int[][] intervals = {{1, 4}, {3, 6}, {2, 8}};
        int output = 2;
        testCase(intervals, output);
    }

    @Test
    void test6() {
        int[][] intervals = {{1, 4}, {2, 3}};
        int output = 1;
        testCase(intervals, output);
    }

    @Test
    void test7() {
        int[][] intervals = {{0, 10}, {5, 12}};
        int output = 2;
        testCase(intervals, output);
    }

    @Test
    void test8() {
        int[][] intervals = {{3, 10}, {4, 10}, {5, 11}};
        int output = 2;
        testCase(intervals, output);
    }

    @Test
    void test9() {
        int[][] intervals = {{1, 2}, {1, 4}, {3, 4}};
        int output = 1;
        testCase(intervals, output);
    }

}