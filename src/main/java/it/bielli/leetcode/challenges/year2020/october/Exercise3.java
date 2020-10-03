package it.bielli.leetcode.challenges.year2020.october;

import java.util.HashSet;
import java.util.Objects;

/**
 * https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/559/week-1-october-1st-october-7th/3482/
 */
public class Exercise3 {

    public int findPairs(int[] nums, int k) {
        HashSet<Pair> pairs = new HashSet<>();

        if (nums.length == 0) {
            return 0;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] - nums[j] == k) {
                    pairs.add(new Pair(nums[i], nums[j]));
                }
                if (nums[j] - nums[i] == k) {
                    pairs.add(new Pair(nums[j], nums[i]));
                }
            }
        }

        return pairs.size();
    }

    static class Pair {

        private int a, b;

        public Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return a == pair.a &&
                    b == pair.b;
        }

        @Override
        public int hashCode() {
            return Objects.hash(a, b);
        }
    }

}
