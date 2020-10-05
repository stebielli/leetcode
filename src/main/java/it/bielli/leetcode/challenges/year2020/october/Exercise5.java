package it.bielli.leetcode.challenges.year2020.october;

/**
 * https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/559/week-1-october-1st-october-7th/3484/
 */
public class Exercise5 {

    public int bitwiseComplement(int N) {
        if (N == 0) {
            return 1;
        }
        int result = 0;
        int pow = 0;
        int partial = N;
        while (partial > 0) {
            result += partial % 2 == 0 ? Math.pow(2, pow) : 0;
            pow++;
            partial /= 2;
        }
        return result;
    }

}
