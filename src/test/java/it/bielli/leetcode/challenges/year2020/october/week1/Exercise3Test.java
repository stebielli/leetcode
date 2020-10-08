package it.bielli.leetcode.challenges.year2020.october.week1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/559/week-1-october-1st-october-7th/3482/
 */
class Exercise3Test {

    private Exercise3 ex;

    @BeforeEach
    void setUp() {
        ex = new Exercise3();
    }

    private void testCase(int[] nums, int k, int output) {
        int pairs = ex.findPairs(nums, k);
        assertEquals(output, pairs);
    }

    @Test
    void test1() {
        int[] nums = {1};
        int k = 2;
        int output = 0;
        testCase(nums, k, output);
    }

    @Test
    void test2() {
        int[] nums = {1, 1, 2};
        int k = 1;
        int output = 1;
        testCase(nums, k, output);
    }

    @Test
    void test3() {
        int[] nums = {3, 1, 4, 1, 5};
        int k = 2;
        int output = 2;
        testCase(nums, k, output);
    }

    @Test
    void test4() {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 1;
        int output = 4;
        testCase(nums, k, output);
    }

    @Test
    void test5() {
        int[] nums = {1, 3, 1, 5, 4};
        int k = 0;
        int output = 1;
        testCase(nums, k, output);
    }

    @Test
    void test6() {
        int[] nums = {1, 2, 4, 4, 3, 3, 0, 9, 2, 3};
        int k = 3;
        int output = 2;
        testCase(nums, k, output);
    }

    @Test
    void test7() {
        int[] nums = {-1, -2, -3};
        int k = 1;
        int output = 2;
        testCase(nums, k, output);
    }

    @Test
    void test8() {
        int[] nums = {-1, -2, -3};
        int k = -1;
        int output = 2;
        testCase(nums, k, output);
    }
}