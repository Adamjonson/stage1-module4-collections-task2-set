package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> multiples = new HashSet<>();
        for (Integer element : sourceList){
            int number = element;
            if (number % 2 == 1){
                multiples.add(Integer.valueOf(number));
                multiples.add(Integer.valueOf(number * 2));
            }else {
                while (number % 2 == 0){
                    multiples.add(Integer.valueOf(number));
                    if (number == 2){
                        multiples.add(1);
                    }
                    number = number / 2;
                }
            }
        }

        return multiples;
    }
}
