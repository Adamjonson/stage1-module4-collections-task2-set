package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> sorted = new HashSet<>();
        int longest = Math.max(firstSet.size(), Math.max(secondSet.size(), thirdSet.size()));
        if (longest == firstSet.size()){
            for (String element : firstSet){
                if (secondSet.contains(element) && !thirdSet.contains(element)){
                    sorted.add(element);
                    System.out.println(element);
                }

            }
            for (String thirdElement : thirdSet){
                if (!firstSet.contains(thirdElement) && !secondSet.contains(thirdElement)){
                    sorted.add(thirdElement);
                }
            }
        }
        else if (longest == secondSet.size()){
            for (String element : secondSet){
                if (firstSet.contains(element) && !thirdSet.contains(element)){
                    sorted.add(element);
                }
                for (String thirdElement : thirdSet){
                    if (!firstSet.contains(thirdElement) && !secondSet.contains(thirdElement)){
                        sorted.add(thirdElement);
                    }
                }
            }
        }
        else if (longest == thirdSet.size()){
            for (String element : thirdSet){
                if (!firstSet.contains(element) && !secondSet.contains(element)){
                    sorted.add(element);
                }
            }
            if (firstSet.size() >= secondSet.size()){
                for (String element : firstSet){
                    if (secondSet.contains(element) && !sorted.contains(element)){
                        sorted.add(element);
                    }
                }
            }else {
                for (String element : secondSet){
                    if (firstSet.contains(element) && !sorted.contains(element)){
                        sorted.add(element);
                    }
                }
            }
        }
        return sorted;
    }
}
