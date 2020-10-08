package it.bielli.leetcode.challenges.year2020.october.week2;

/**
 * https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/560/week-2-october-8th-october-14th/3488/
 */
public class Exercise1 {

    public int search(int[] nums, int target) {
        int firsIndex = 0;
        int lastIndex = nums.length - 1;
        while (firsIndex <= lastIndex) {
            int middleIndex = (lastIndex + firsIndex) / 2;
            if (target == nums[middleIndex])
                return middleIndex;
            if (target < nums[middleIndex])
                lastIndex = middleIndex - 1;
            if (target > nums[middleIndex])
                firsIndex = middleIndex + 1;
        }

        return -1;
    }

}
