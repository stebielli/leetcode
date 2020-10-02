package it.bielli.leetcode.random;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/zigzag-conversion/
 */
public class Exercise2Test {

    private Exercise2 ex;

    @BeforeEach
    void setUp() {
        ex = new Exercise2();
    }

    @Test
    void test1() {
        assertEquals("A", ex.convert("A", 1));
    }

    @Test
    void test2() {
        assertEquals("PAHNAPLSIIGYIR", ex.convert("PAYPALISHIRING", 3));
    }

    @Test
    void test3() {
        assertEquals("PINALSIGYAHRPI", ex.convert("PAYPALISHIRING", 4));
    }

    @Test
    void test4() {
        assertEquals("AB", ex.convert("AB", 1));
    }
}
