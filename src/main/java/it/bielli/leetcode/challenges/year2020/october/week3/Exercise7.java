package it.bielli.leetcode.challenges.year2020.october.week3;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/561/week-3-october-15th-october-21st/3502/
 */
public class Exercise7 {

    public int[] asteroidCollision(int[] asteroids) {
        if (asteroids.length == 1)
            return asteroids;

        LinkedList<Integer> remainings = new LinkedList<>();
        remainings.add(asteroids[0]);
        for (int i = 1; i < asteroids.length; i++) {
            int rightOne = asteroids[i];
            if (rightOne < 0) {
                Iterator<Integer> descendingIterator = remainings.descendingIterator();
                while (descendingIterator.hasNext() && rightOne != 0) {
                    Integer next = descendingIterator.next();
                    if (next > 0) {
                        if (Math.abs(next) < Math.abs(rightOne)) {
                            descendingIterator.remove();
                        } else if (Math.abs(next) == Math.abs(rightOne)) {
                            descendingIterator.remove();
                            rightOne = 0;
                        } else {
                            rightOne = 0;
                        }
                    }
                }
            }

            if (rightOne != 0) {
                remainings.addLast(rightOne);
            }
        }

        return remainings.stream().mapToInt(i -> i).toArray();
    }

}
