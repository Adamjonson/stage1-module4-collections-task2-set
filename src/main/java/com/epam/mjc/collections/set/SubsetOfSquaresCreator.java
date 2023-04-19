package com.epam.mjc.collections.set;

import java.io.PrintStream;
import java.util.*;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        HashSet<Integer> squares = new HashSet();
        for (Integer element : sourceList){
            int number = element;
            squares.add(Integer.valueOf(number * number));
        }

        Set<Integer> limited = new TreeSet<>();
        for (Integer element : squares){
            int number = element;
            if (number >= lowerBound && number <= upperBound) {
                limited.add(number);
            }
        }
        return limited;
    }
}
