package it.bielli.leetcode.challenges.year2020.october.week1;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/559/week-1-october-1st-october-7th/3483/
 */
public class Exercise4 {

    public int removeCoveredIntervals(int[][] intervals) {
        List<int[]> result = new ArrayList<>();
        for (int[] interval : intervals) {
            result = updateResult(interval, result);
        }
        return result.size();
    }

    private List<int[]> updateResult(int[] interval, List<int[]> result) {
        List<int[]> replace = new ArrayList<>(result);

        boolean hasToBeAdded = true;
        for (int[] r : result) {
            if (interval[0] <= r[0] && interval[1] >= r[1]) {
                replace.remove(r);
            } else if (r[0] <= interval[0] && r[1] >= interval[1]) {
                hasToBeAdded = false;
            }
        }
        if (hasToBeAdded) {
            replace.add(interval);
        }

        return replace;
    }

}
