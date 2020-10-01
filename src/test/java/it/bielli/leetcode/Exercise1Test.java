package it.bielli.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/longest-palindromic-substring/
 */
public class Exercise1Test {

    private Exercise1 ex;

    @BeforeEach
    void setUp() {
        ex = new Exercise1();
    }

    private void testCase(String input, String output) {
        assertEquals(output, ex.longestPalindrome(input));
    }

    @Test
    void test1() {
        testCase("b", "b");
    }

    @Test
    void test2() {
        testCase("bb", "bb");
    }

    @Test
    void test3() {
        testCase("aba", "aba");
    }

    @Test
    void test4() {
        testCase("abc", "c");
    }

    @Test
    void test5() {
        testCase("baa", "aa");
    }

    @Test
    void test6() {
        testCase("aab", "aa");
    }

    @Test
    void test7() {
        testCase("babad", "aba");
    }

    @Test
    void test8() {
        testCase("cbbd", "bb");
    }

    @Test
    void test9() {
        testCase("poprorpassaassad", "assaassa");
    }
}
