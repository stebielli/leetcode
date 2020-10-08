package it.bielli.leetcode.challenges.year2020.october.week1;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/559/week-1-october-1st-october-7th/3480/
 */
public class Exercise1 {

    /**
     * Your RecentCounter object will be instantiated and called as such:
     * RecentCounter obj = new RecentCounter();
     * int param_1 = obj.ping(t);
     */
    static class RecentCounter {

        private Queue<Integer> list;

        public RecentCounter() {
            list = new ArrayDeque<>();
        }

        public int ping(int t) {
            list.add(t);
            while (!list.isEmpty() && list.peek() < (t - 3000)) {
                    list.poll();
            }
            return list.size();
        }
    }

}
