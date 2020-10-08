package it.bielli.leetcode.challenges.year2020.october.week1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/559/week-1-october-1st-october-7th/3481/
 */
public class Exercise2Test {

    private Exercise2 exercise2;

    @BeforeEach
    void setUp() {
        exercise2 = new Exercise2();
    }

    private void testCase(int[] candidates, int target, int[][] output) {
        List<List<Integer>> lists = exercise2.combinationSum(candidates, target);

        Arrays.stream(output)
                .forEach(ints -> {
                    boolean anyMatch = lists.stream()
                            .anyMatch(
                                    list -> {
                                        List<Integer> collect = IntStream.of(ints).boxed().sorted().collect(Collectors.toList());
                                        return list.stream().sorted().collect(Collectors.toList()).equals(collect);
                                    }
                            );
                    assertTrue(anyMatch);
                });
    }

    @Test
    void test1() {
        int[] candidates = {};
        int target = 1;
        int[][] output = {};
        testCase(candidates, target, output);
    }

    @Test
    void test2() {
        int[] candidates = {2};
        int target = 2;
        int[][] output = {{2}};
        testCase(candidates, target, output);
    }

    @Test
    void test3() {
        int[] candidates = {1};
        int target = 2;
        int[][] output = {{1, 1}};
        testCase(candidates, target, output);
    }

    @Test
    void test4() {
        int[] candidates = {1, 2};
        int target = 2;
        int[][] output = {{1, 1}, {2}};
        testCase(candidates, target, output);
    }

    @Test
    void test5() {
        int[] candidates = {1, 2, 3};
        int target = 3;
        int[][] output = {{1, 1, 1}, {1, 2}, {3}};
        testCase(candidates, target, output);
    }

    @Test
    void test6() {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        int[][] output = {{7}, {2, 2, 3}};
        testCase(candidates, target, output);
    }

    @Test
    void test7() {
        int[] candidates = {1, 2};
        int target = 4;
        int[][] output = {{1, 1, 1, 1}, {1, 1, 2}, {2, 2}};
        testCase(candidates, target, output);
    }

}
