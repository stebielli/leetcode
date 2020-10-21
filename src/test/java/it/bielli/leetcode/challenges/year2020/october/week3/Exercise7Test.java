package it.bielli.leetcode.challenges.year2020.october.week3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/561/week-3-october-15th-october-21st/3502/
 */
class Exercise7Test {

    private Exercise7 ex;

    @BeforeEach
    void setUp() {
        ex = new Exercise7();
    }

    private void testCase(int[] asteroids, int[] output) {
        assertArrayEquals(output, ex.asteroidCollision(asteroids));
    }

    @Test
    void test1() {
        int[] asteroids = {1};
        int[] output = {1};
        testCase(asteroids, output);
    }

    @Test
    void test2() {
        int[] asteroids = {1, -2};
        int[] output = {-2};
        testCase(asteroids, output);
    }

    @Test
    void test3() {
        int[] asteroids = {1, -1};
        int[] output = {};
        testCase(asteroids, output);
    }

    @Test
    void test4() {
        int[] asteroids = {10, 2, -5};
        int[] output = {10};
        testCase(asteroids, output);
    }

    @Test
    void test5() {
        int[] asteroids = {-2, 2, -1, -2};
        int[] output = {-2};
        testCase(asteroids, output);
    }

}
