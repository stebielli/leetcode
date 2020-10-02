package it.bielli.leetcode.random;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/problems/zigzag-conversion/
 */
public class Exercise2 {

    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return  s;
        }

        List<LinkedList<Character>> ds = initDataStructure(numRows);

        boolean forward = true;
        int verticalPosition = 0;
        for (int index = 0; index < s.length(); index++) {
            if (!forward) {
                nullifyOthers(ds, verticalPosition);
            }

            ds.get(verticalPosition).addLast(s.charAt(index));

            if (forward) {
                if (verticalPosition + 1 < numRows) {
                    verticalPosition++;
                } else {
                    forward = false;
                    verticalPosition--;
                }
            } else {
                if (verticalPosition - 1 >= 0) {
                    verticalPosition--;
                } else {
                    forward = true;
                    verticalPosition++;
                }
            }
        }

        return convert(ds);
    }

    private List<LinkedList<Character>> initDataStructure(int numRows) {
        List<LinkedList<Character>> ds = new ArrayList<>(numRows);
        for (int i = 0; i < numRows; i++) {
            ds.add(new LinkedList<>());
        }
        return ds;
    }

    private void nullifyOthers(List<LinkedList<Character>> ds, int verticalPosition) {
        for (int i = 0; i < ds.size(); i++) {
            if (i != verticalPosition) {
                ds.get(i).addLast(null);
            }
        }
    }

    private String convert(List<LinkedList<Character>> ds) {
        StringBuilder conversion = new StringBuilder();

        for (LinkedList<Character> list : ds) {
            while (!list.isEmpty()) {
                Character c = list.pollFirst();
                if (c != null) {
                    conversion.append(c);
                }
            }
        }
        return conversion.toString();
    }

}
