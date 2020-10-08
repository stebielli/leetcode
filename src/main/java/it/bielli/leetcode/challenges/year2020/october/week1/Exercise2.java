package it.bielli.leetcode.challenges.year2020.october.week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/559/week-1-october-1st-october-7th/3481/
 */
public class Exercise2 {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
        for (int current : candidates) {
            if (current == target) {
                results.add(Arrays.asList(current));
            } else if (target - current > 0) {
                combinationSum(candidates, target - current)
                        .forEach(list -> {
                            ArrayList<Integer> newList = new ArrayList<>();
                            newList.add(current);
                            newList.addAll(list);

                            if (results.stream()
                                    .noneMatch(l ->
                                            l.stream().sorted()
                                                    .collect(Collectors.toList())
                                                    .equals(newList.stream().sorted().collect(Collectors.toList())))
                            ) {
                                results.add(newList);
                            }
                        });
            }
        }

        return results;
    }


}
