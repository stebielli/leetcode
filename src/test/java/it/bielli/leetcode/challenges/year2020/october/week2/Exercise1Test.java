package it.bielli.leetcode.challenges.year2020.october.week2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/560/week-2-october-8th-october-14th/3488/
 */
class Exercise1Test {

    private Exercise1 ex;

    @BeforeEach
    void setUp() {
        ex = new Exercise1();
    }

    private void testCase(int[] nums, int target, int output) {
        assertEquals(output, ex.search(nums, target));
    }

    @Test
    void test1() {
        int[] nums = {};
        int target = 0;
        int output = -1;
        testCase(nums, target, output);
    }

    @Test
    void test2() {
        int[] nums = {0, 4, 5};
        int target = 3;
        int output = -1;
        testCase(nums, target, output);
    }

    @Test
    void test3() {
        int[] nums = {0, 4, 5};
        int target = 4;
        int output = 1;
        testCase(nums, target, output);
    }

}