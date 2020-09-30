package it.bielli.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
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

    @Test
    void test0() {
        assertEquals("b", ex.longestPalindrome("b"));
    }

    @Test
    @Disabled
    void test1() {
        assertEquals("bab", ex.longestPalindrome("babad"));
    }

    @Test
    @Disabled
    void test2() {
        assertEquals("bb", ex.longestPalindrome("cbbd"));
    }

    @Test
    @Disabled
    void test3() {
        assertEquals("assaassa", ex.longestPalindrome("poprorpassaassad"));
    }
}
